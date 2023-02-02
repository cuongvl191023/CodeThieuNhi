package Java;

import java.util.Scanner;

class Bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron ");
        double a = in.nextDouble();
        System.out.println("Chu vi hinh tron la" + (2 * a * Math.PI));
        System.out.println("Dien tich hinh tron la" + (a * a * Math.PI));
        in.close();
    }
}