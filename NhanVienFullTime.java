package BAITAP;

public class NhanVienFullTime extends NhanVien implements Comparable<NhanVienFullTime> {
    double tienThuong;
    double tienPhat;
    double luongCung;

    public NhanVienFullTime() {
    }


    public NhanVienFullTime(int maNV, String name, int tuoiNV, int soDienThoai, String email, double tienThuong, double tienPhat, double luongCung) {
        super(maNV, name, tuoiNV, soDienThoai, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public static void main(String[] args) {

    }
    public  double moneyFull(){
        double moneyfull=(luongCung+(tienThuong-tienPhat));
        return moneyfull;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "tienThuong=" + tienThuong +
                ", tienPhat=" + tienPhat +
                ", luongCung=" + luongCung +
                ", maNV=" + maNV +
                ", name='" + name + '\'' +
                ", tuoiNV=" + tuoiNV +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(NhanVienFullTime o) {
        return (int) (this.luongCung - o.luongCung);
    }
}
