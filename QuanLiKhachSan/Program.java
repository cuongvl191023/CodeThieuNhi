package QuanLiKhachSan;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan khachSan = new KhachSan(); // Tạo một đối tượng khách sạn mới
        int luaChon = 0; // Tạo một biến lựa chọn để xem người dùng muốn dùng chức năng gì
        do {
            // In ra menu các chức năng và lựa chọn tương ứng
            System.out.println(
                    "******************************************Menu******************************************");
            System.out.println("1. Them khach tro");
            System.out.println("2. Hien thi danh sach khach tro");
            System.out.println("3. Xoa khach tro");
            System.out.println("4. Tinh tien khach tro");
            System.out.println("0. Thoat");
            System.out.println(
                    "******************************************Menu******************************************");
            System.out.print("Lua chon: ");
            luaChon = scanner.nextInt(); // Cho người dùng chọn chức năng
            scanner.nextLine();
            switch (luaChon) { // Kiểm tra xem người dùng chọn chức năng số mấy và thực hiện chức năng tương
                               // ứng
                case 1: // Nếu là chức năng 1
                    khachSan.themKhach(); // Dùng phương thức thêm khách trọ của khách sạn
                    break;
                case 2: // Nếu là chức năng 2
                    khachSan.hienThiDanhSachKhach(); // Dùng phương thức hiển thị khách trọ của khách sạn
                    break;
                case 3: // Nếu là chức năng 3
                    khachSan.xoaKhach(); // Dùng phương thức xóa khách trọ của khách sạn
                    break;
                case 4: // Nếu là chức năng 4
                    khachSan.tinhTienThuePhong(); // Dùng phương thức tính tiền khách trọ của khách sạn
                    break;
                case 0: // Nếu là chức năng 0
                    System.exit(0); // Nếu người dùng nhập là 0 thì kết thúc chương trình
                    break;
                default: // Nếu người dùng nhập vào một số không phải 1,2,3,4,0 thì cho làm lại
                    System.out.println("Nhap sai hay nhap lai: ");
                    break;
            }
        } while (luaChon != 0); // Nếu người dùng chưa nhập 0 thì vẫn tiếp tục vòng lặp cho đến khi họ nhập 0
    }
}