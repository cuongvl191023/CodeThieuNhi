package QuanLiKhachSan;

import java.util.ArrayList;

public class KhachSan {
    private ArrayList<KhachTro> danhSachKhach; // Tạo nên một list khách trọ (danhSachKhach) cũng tương tự như danh sách
                                               // các khách trọ trong khách sạn

    public KhachSan() { // Constructor
        danhSachKhach = new ArrayList<KhachTro>();
    }

    public void themKhach(KhachTro khach) { // Phương thức thêm khách trọ là một hàm truyền vào khách trọ cần thêm
                                            // (khach) và sau đó thêm vào danh sách khách trọ của khách sạn
                                            // (danhSachKhach)
        danhSachKhach.add(khach);
    }

    public void xoaKhach(String soCMND) { // Phương thức xóa khách trọ là một hàm truyền vào số CMND của khách cần xóa
                                          // và
        // sau đó xóa khỏi danh sách khách trọ của khách sạn (danhSachKhach) khách trọ
        // nào có số CMND như đã truyền vào (soCMND)
        for (KhachTro khach : danhSachKhach) { // Hàm này như kiểu nó sẽ đi qua tất cả các khách trọ (khach) trong danh
                                               // sách khách trọ trong khách sạn (danhSachKhach)
            if (khach.getSoCMND().equals(soCMND)) { // Nếu khách trọ (khach) có số CMND (getSoCMND()) bằng với
                                                    // (equals()) số CMND của khách trọ cần xóa (soCMND)
                danhSachKhach.remove(khach); // Thì sẽ xóa khách trọ đó (khach) khỏi danh sách khách trọ của khách sạn
                                             // (danhSachKhach)
                break; // Sau khi xóa xong thì dừng ngay vòng lặp
            }
            // Nếu khách trọ (khach) có số CMND (getSoCMND()) không bằng với (equals()) số
            // CMND của khách trọ cần xóa (soCMND) thì tiếp tục tới khách tiếp theo (khach)
            // trong danh sách khách trọ của khách sạn (danhSachKhach)
        }
    }

    public void hienThiDanhSachKhach() {
        for (KhachTro khach : danhSachKhach) {// Hàm này như kiểu nó sẽ đi qua tất cả các khách trọ (khach) trong danh
                                              // sách khách trọ trong khách sạn (danhSachKhach)
            System.out.println("Ho va ten: " + khach.getHoTen());
            System.out.println("Ngay sinh: " + khach.getNgaySinh().getDate() + " - " + khach.getNgaySinh().getMonth()
                    + " - " + khach.getNgaySinh().getYear());
            System.out.println("So CMND: " + khach.getSoCMND());
            System.out.println("So ngay tro: " + khach.getSoNgayTro());
            System.out.println("Loai phong: " + khach.getLoaiPhong());
            System.out.println("Gia phong: " + khach.getGiaPhong());
            // Sau đó in ra các thông tin cần thiết bằng các phương thức của đối tượng khách
            // trọ (khach)
        }
    }

    public void tinhTienThuePhong(String soCMND) {
        for (KhachTro khach : danhSachKhach) {
            if (khach.getSoCMND().equals(soCMND)) {
                System.out.println("So tien khach tro phai tra: " + khach.getGiaPhong() * khach.getSoNgayTro());
            }
        }
        // Hàm này tương tự như hàm xóa chỉ khác là nếu số CMND (getSoCMND()) bằng với
        // số CMND của khách cần tính tiền (soCMND) thì tính tiền (khach.getGiaPhong() *
        // khach.getSoNgayTro()) rồi in ra chứ không xóa
    }
}
