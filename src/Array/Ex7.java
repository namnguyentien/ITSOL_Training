package Array;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so phan tu: ");
            n = sc.nextInt();
        }while (n<0);

        System.out.println("nhap cac phan tu cua mang:");
        int[] a = new int[n];
        for(int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        duongChayDaiNhat(a, n);
    }
    public static void duongChayDaiNhat(int[]a, int n) {
        int max = 1;
        int min = 1;
        int viTri = 0;
        for(int i = 0; i < n; i++) {
            min = 1;
            for (int j = i; j < n -1; j++) {
                if(a[j] < a[j+1]) {
                    min++;
                }else {
                    break;
                }
            }
            if(min > max) {
                max = min;
                viTri = i;
            }
        }
        System.out.println("vi tri: "+ viTri  + " với độ dài là " + max);
    }
}
