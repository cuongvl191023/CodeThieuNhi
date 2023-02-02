package Java;

import java.util.Scanner;

class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap tien Viet Nam ");
        double a = in.nextInt();
        System.out.println("So tien USD duoc la " + (a / 15640));
        System.out.println("So tien Euro duoc la " + (a / 19378));
        System.out.println("So tien Yen duoc la " + (a / 145));
        in.close();
    }
}