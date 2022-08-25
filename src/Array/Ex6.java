package Array;

import sun.applet.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a, b, c;
        int m, n, k, p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m, n: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        k = m + n;


        System.out.println("Nhap gia tri mang a[] gom " + m + " phan tu");
        a = nhap(m);
        System.out.println("Nhap gia tri b[] gom " + n + " phan tu");
        b = nhap(n);
        c = new int[k];
        System.out.println("Nhap gia tri p: ");

        do {
            p = scanner.nextInt();
        } while (p >= m || p < 0);


        for (int i = 0; i < p; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < n; i++) {
            c[i + p] = b[i];
        }

        for (int i = p; i < m; i++) {
            c[i + n] = a[i];
        }

        System.out.println("Mang a[]: " + Arrays.toString(a));
        System.out.println("Mang b[]: " + Arrays.toString(b));
        System.out.println("Mang c[]: " + Arrays.toString(c));
    }

    public static int[] nhap(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        return x;
    }
}
