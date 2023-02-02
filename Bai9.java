package Java;

import java.util.Scanner;

class Bai9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ho ten khach ");
        String a = in.nextLine();
        System.out.print("So lon nhot da mua ");
        int b = in.nextInt();
        System.out.println("Ho ten khach hang " + a);
        System.out.println("So lon nhot " + b);
        System.out.println("So tien phai tra " + (b * 35000));
        System.out.println("**********Qua tang**********");
        System.out.println("So quet ga " + (b / 3));
        System.out.println("So viet " + (b % 3 * 2));
        in.close();
    }
}