package Java;

import java.util.Scanner;

class Bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu dai canh thu nhat cua hinh chu nhat");
        double a = in.nextDouble();
        System.out.print("Nhap chieu dai canh thu hai cua hinh chu nhat");
        double b = in.nextDouble();
        System.out.println("Chu vi hinh chu nhat la " + (a + b + a + b));
        System.out.println("Dien tich hinh chu nhat la " + (a * b));
        in.close();
    }
}