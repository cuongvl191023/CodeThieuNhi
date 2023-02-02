package Java;

import java.util.Scanner;

class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chuoi tren dong lenh la ");
        String a = in.nextLine();
        System.out.println("Ket qua chuyen sang chu hoa la " + a.toUpperCase());
        System.out.println("Ket qua chuyen sang chu thuong la " + a.toLowerCase());
        in.close();
    }
}