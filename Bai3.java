package Java;

import java.util.Scanner;

class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap hai canh ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Chieu dai canh huyen la" + (Math.sqrt(a * a + b * b)));
        System.out.println("Chu vi tam giac la" + (a + b + Math.sqrt(a * a + b * b)));
        System.out.println("Dien tich tam giac la" + ((a * b) / 2));
        in.close();
    }
}