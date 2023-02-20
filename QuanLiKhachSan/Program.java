package QuanLiKhachSan;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan = new KhachSan(); // Tạo một đối tượng khách sạn mới
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
            KhachTro khach = new KhachTro(hoTen, new Date(namSinh, thangSinh, ngaySinh), soCMND, soNgayTro, loaiPhong,
                    giaPhong); // Tạo một đối tượng khách trọ mới từ các thông tin đã nhập. Và khởi tạo với
                               // Constructor
            khachSan.themKhach(khach); // Khi tạo một khách sạn mới (khachSan) thì nó đã có một danh sách khách trọ với
                                       // số lượng là 0 do cấu hình ở class khách sạn dùng phương thức thêm khách trọ
                                       // (themKhach) để thêm khách trọ đã nhập vào danh sách khách trọ của khách sạn
        }
        System.out.println("Danh sach khach dang tro:");
        khachSan.hienThiDanhSachKhach(); // Dùng phương thức hiển thị danh sách để hiển thị danh sách khách trọ
        System.out.print("Nhap so CMND cua khach can tinh tien: ");
        String soCMND = scanner.nextLine(); // Nhập so CMND cua khach can tinh tien
        khachSan.tinhTienThuePhong(soCMND); // Dùng phương thức tính tiền để hiển thị ra số tiền mà khách trọ có số CMND
                                            // đã nhập ở trên (soCMND) phải trả
        System.out.print("Nhap so CMND cua khach can xoa: ");
        soCMND = scanner.nextLine(); // Nhập so CMND cua khach can xoa
        khachSan.xoaKhach(soCMND); // Dùng phương thức xóa để xóa khách trọ có số CMND đã nhập ở trên (soCMND)
        System.out.println("Danh sach khach sau khi xoa:");
        khachSan.hienThiDanhSachKhach(); // Dùng phương thức hiển thị danh sách để hiển thị danh sách khách trọ lần nữa
                                         // kiểm tra xem xóa được chưa
        scanner.close();
    }
}