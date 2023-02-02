package Java;

import java.util.Scanner;

class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ho ten ban ");
        String a = in.nextLine();
        System.out.print("Nhap so ngay cong ");
        int b = in.nextInt();
        System.out.print("Nhap so con ");
        int c = in.nextInt();
        System.out.println("Xin chao " + a);
        System.out.println("So tien luong duoc linh la " + (100000 * b + 500000 * c));
        in.close();
    }
}