package QuanLiKhachSan;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> danhSachKhach; // Tạo nên một list khách trọ (danhSachKhach) cũng tương tự như danh sách
                                               // các khách trọ trong khách sạn

    public KhachSan() { // Constructor
        danhSachKhach = new ArrayList<KhachTro>();
    }

    public void themKhach() { // Phương thức thêm khách trọ là một hàm nhập vào khách trọ cần thêm và sau đó
                              // thêm vào danh sách khách trọ của khách sạn
                              // (danhSachKhach)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong khach: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            // Lấy các thông tin khách trọ để chuẩn bị thêm vào danh sách khách trọ của
            // khách sạn
            System.out.println("Nhap thong tin khach " + i + ":");
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngay sinh: ");
            int ngaySinh = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Thang sinh: ");
            int thangSinh = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nam sinh: ");
            int namSinh = scanner.nextInt();
            scanner.nextLine();
            System.out.print("So CMND: ");
            String soCMND = scanner.nextLine();
            System.out.print("So ngay tro: ");
            int soNgayTro = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Loai phong: ");
            String loaiPhong = scanner.nextLine();
            System.out.print("Gia phong: ");
            double giaPhong = scanner.nextDouble();
            scanner.nextLine();
            danhSachKhach.add(new KhachTro(hoTen, new Date(namSinh, thangSinh, ngaySinh), soCMND, soNgayTro, loaiPhong,
                    giaPhong)); // Khi tạo một khách sạn mới thì nó đã có một danh sách khách trọ với
                                // số lượng là 0 do cấu hình ở class khách sạn dùng phương thức thêm khách trọ
                                // (add) để thêm khách trọ đã nhập vào danh sách khách trọ của khách sạn
                                // (danhSachKhach)
        }
    }

    public void xoaKhach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so CMND cua khach tro muon xoa: ");
        String soCMND = scanner.nextLine(); // Nhập vào số CMND cua khach tro muon xoa
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
        System.out.print("Day la danh sach khach tro: ");
        for (KhachTro khach : danhSachKhach) {// Hàm này như kiểu nó sẽ đi qua tất cả các khách trọ (khach) trong danh
                                              // sách khách trọ trong khách sạn (danhSachKhach)
            System.out.println("Ho va ten: " + khach.getHoTen());
            System.out.println("Ngay sinh: " + khach.getNgaySinh().getDate() + " - " + khach.getNgaySinh().getMonth()
                    + " - " + khach.getNgaySinh().getYear());
            System.out.println("So CMND: " + khach.getSoCMND());
            System.out.println("So ngay tro: " + khach.getSoNgayTro());
            System.out.println("Loai phong: " + khach.getLoaiPhong());
            System.out.println("Gia phong: " + khach.getGiaPhong());
            System.out.println("--------------");
            // Sau đó in ra các thông tin cần thiết bằng các phương thức của đối tượng khách
            // trọ (khach)
        }
    }

    public void tinhTienThuePhong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so CMND cua khach tro muon tinh tien: ");
        String soCMND = scanner.nextLine(); // Nhap so CMND cua khach tro muon tinh tien
        for (KhachTro khach : danhSachKhach) {
            if (khach.getSoCMND().equals(soCMND)) {
                System.out.println("So tien khach tro co so CMND la " + soCMND + " phai tra: "
                        + khach.getGiaPhong() * khach.getSoNgayTro());
            }
        }
        // Hàm này tương tự như hàm xóa chỉ khác là nếu số CMND (getSoCMND()) bằng với
        // số CMND của khách cần tính tiền (soCMND) thì tính tiền (khach.getGiaPhong() *
        // khach.getSoNgayTro()) rồi in ra chứ không xóa
    }
}
