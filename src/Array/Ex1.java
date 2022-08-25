package Array;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean checkDoiXung=true;
        do {
            System.out.println("So phan tu: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu a[" + i + "]" + ": ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                checkDoiXung = false;
            }
        }
        if(checkDoiXung==true){
            System.out.println("mang doi xung");
        }
        else System.out.println("mang khong doi xung");
    }
}
