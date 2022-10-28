package BAITAP;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class MainNhanVien implements Comparator {
    public static void main(String[] args) {
        BAITAP.NhanVien[] nhanVien = new BAITAP.NhanVien[10];
        nhanVien[0] = new NhanVienFullTime(1, "A", 19, 99, "vi", 100, 100, 800);
        nhanVien[1] = new NhanVienFullTime(2, "B", 20, 99, "vi", 200, 50, 1000);
        nhanVien[2] = new NhanVienFullTime(3, "C", 21, 99, "vi", 300, 10, 2000);
        nhanVien[3] = new NhanVienFullTime(4, "D", 22, 99, "vi", 100, 50, 2500);
        nhanVien[4] = new NhanVienFullTime(5, "E", 23, 99, "vi", 150, 50, 3000);
        nhanVien[5] = new NhanVienParttime(6, "F", 19, 99, "VI", 100);
        nhanVien[6] = new NhanVienParttime(7, "G", 19, 99, "VI", 110);
        nhanVien[7] = new NhanVienParttime(8, "H", 19, 99, "VI", 120);
        nhanVien[8] = new NhanVienParttime(9, "I", 19, 99, "VI", 130);
        nhanVien[9] = new NhanVienParttime(10, "K", 19, 99, "VI", 140);
        System.out.println(MainNhanVien.tBCaCty(nhanVien));
        luongPartTimeCty(nhanVien);
        MainNhanVien.soSanhLuongFvstb(nhanVien);
        MainNhanVien.softFull(nhanVien);
    }

    public static double tBCaCty(BAITAP.NhanVien[] nhanVien) {
        double sum = 0;
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienFullTime) {
                sum += ((NhanVienFullTime) nhanVien[i]).moneyFull();

            } else if (nhanVien[i] instanceof NhanVienParttime) {
                sum += ((NhanVienParttime) nhanVien[i]).moneyPart();
            }

        }
        return  sum / (nhanVien.length);
    }

    public static void luongPartTimeCty(BAITAP.NhanVien[] nhanVien) {
        int allluongPart = 0;
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienParttime) {
                allluongPart += ((NhanVienParttime) nhanVien[i]).moneyPart();
            }
        }
        System.out.println("lương nhân viên parttime cả cty là " + allluongPart);

    }

    public static void soSanhLuongFvstb(NhanVien[] nhanVien) {
        for (int i = 0; i < nhanVien.length; i++) {
            if (nhanVien[i] instanceof NhanVienFullTime) {
                if ((((NhanVienFullTime) nhanVien[i]).moneyFull()) < tBCaCty(nhanVien)) {
                    System.out.println("thông tin nhân viên fulltime có mức lương thấp hơn mức lương tb là " + nhanVien[i].toString());
                }
            }
        }
    }

    public static void softFull(NhanVien[] nhanVien){
        NhanVienFullTime[] arr=new NhanVienFullTime[5];
        int count=0;
        for (int i=0; i< nhanVien.length;i++){
            if(nhanVien[i] instanceof NhanVienFullTime){
                arr[count]=(NhanVienFullTime) nhanVien[i];
                count++;
            }
        }

        for(int i=0;i< arr.length;i++){
            double num=arr[i].moneyFull();
            for(int j=i;j<arr.length;j++){
                if(num>arr[j].moneyFull()){
                    num=arr[j].moneyFull();
                    NhanVienFullTime temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }



    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
