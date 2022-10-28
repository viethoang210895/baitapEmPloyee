package BAITAP;

public class NhanVien {
    public int maNV;
    public String name;
    public int tuoiNV;
    public int soDienThoai;
    public String email;

    public NhanVien() {
    }

    public NhanVien(int maNV, String name, int tuoiNV, int soDienThoai, String email) {
        this.maNV = maNV;
        this.name = name;
        this.tuoiNV = tuoiNV;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoiNV() {
        return tuoiNV;
    }

    public void setTuoiNV(int tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
