package Array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so luong phan tu cua mang: ");
            n = sc.nextInt();
        }while (n<=0);

        int[] arr = new int[n];
        int[] arrCount = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu: " + (i + 1));
            arr[i] = sc.nextInt();
            arrCount[i] = -1;
        }


        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arrCount[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    arrCount[j] = 0;
                }
            }

            if (arrCount[i] != 0) {
                arrCount[i] = count;
            }
        }


        for (int i = 0; i < n; i++) {
            if (arrCount[i] != 0) {
                System.out.println("Phan tu "+ arr[i] + " xuat hien " + arrCount[i] + " lan");
            }
        }

        // tim max
        int max = arrCount[0];
        for (int i = 0; i < n; i++) {
            if (arrCount[i] > max) {
                max = arrCount[i];
            }
        }
        System.out.print("Phan tu co so lan xuat hien nhieu nhat: ");
        for (int i = 0; i < n; i++) {
            if (arrCount[i] == max) {
                System.out.print(arr[i] +" ");
            }
        }


    }
}
