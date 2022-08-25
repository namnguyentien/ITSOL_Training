package Array;

import java.util.Scanner;

public class Ex4 {


    public static void main(String[] args) {
        int n, x, index = -1, min = Integer.MAX_VALUE;
        int[] a;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so phan tu: ");
            n = scanner.nextInt();
        }while (n<=0);
        System.out.println("Nhap vao so X: ");
        x = scanner.nextInt();

        a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu "+i);
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int currentMin = getMin(a[i], x);
            if (nguyenTo(a[i]) && currentMin < min) {
                min = currentMin;
                index = i;
            }
        }

        if (index != -1) {
            System.out.println("Phan tu co chi so: " + index + ", Co gia tri = " + a[index]+" gan X nhat");
        } else {
            System.out.println("Khong ton tai gia tri thoa man!");
        }
    }

    public static int getMin(int b, int x) {
        return Math.abs(b - x);
    }

    public static boolean nguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
