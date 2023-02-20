package QuanLiKhachSan;

import java.util.Date;

// Từ khóa this ở đây là chỉ class Nguoi nếu có một người cụ thể như Nguoi1 thì từ this.hoTen chính là Nguoi1.hoten
public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String soCMND;

    public Nguoi(String hoTen, Date ngaySinh, String soCMND) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
    }

    public String getHoTen() { // Trả về họ tên của người (hoten)
        return hoTen;
    }

    public Date getNgaySinh() { // Trả về ngày sinh của người (ngaySinh)
        return ngaySinh;
    }

    public String getSoCMND() { // Trả về số CMND của người (soCMND)
        return soCMND;
    }

    public void setHoTen(String hoTenNew) { // Gán họ tên của người (this.hoTen) bằng họ tên mới (hoTenNew)
        this.hoTen = hoTenNew;
    }

    public void setNgaySinh(Date ngaySinhNew) { // Gán ngày sinh của người (this.ngaySinh) bằng ngày sinh mới
                                                // (ngaySinhNew)
        this.ngaySinh = ngaySinhNew;
    }

    public void setSoCMND(String soCMNDNew) { // Gán số CMND của người (this.soCMND) bằng số CMND mới (soCMNDNew)
        this.soCMND = soCMNDNew;
    }
}
