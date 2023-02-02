package Java;

import java.util.Scanner;

class Bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chieu dai ");
        double a = in.nextDouble();
        System.out.println(a + " cm tuong duong voi  " + (a / 2.54) + " inches");
        in.close();
    }
}