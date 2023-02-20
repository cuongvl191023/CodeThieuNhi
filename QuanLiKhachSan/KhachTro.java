package QuanLiKhachSan;

import java.util.Date;

// Class Khách trọ và class Người tương tự nhau
public class KhachTro extends Nguoi {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public KhachTro(String hoTen, Date ngaySinh, String soCMND, int soNgayTro, String loaiPhong, double giaPhong) {
        super(hoTen, ngaySinh, soCMND);
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public void setNguoi(Nguoi nguoi) {
        this.setHoTen(nguoi.getHoTen());
        this.setNgaySinh(nguoi.getNgaySinh());
        this.setSoCMND(nguoi.getHoTen());
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public double tinhTienThuePhong() {
        return soNgayTro * giaPhong;
    }
}
