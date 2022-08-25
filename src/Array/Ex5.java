package Array;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        nhap();
    }
    public static void nhap(){
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        n = sc.nextInt();
        a = new int [n+1];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < a.length-1; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        sapXepTangDan(a);
        System.out.println("Nhap phan tu can chen: ");
        int x = sc.nextInt();
        chen(a,x);
    }
    public static void sapXepTangDan(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void chen(int a[],int x){
        if(a[0]>x){
            for(int i=a.length-1;i>0;i--)
                a[i]=a[i-1];
            a[0]=x;
        }
        else if(a[a.length-2]<x) a[a.length-1]=x;
        else {
            int index=0;
            for(int i=0;i<a.length-1;i++)
                if(a[i]>x){
                    index=i;
                    break;
                }

            for(int i =a.length-1;i>index;i--)
                a[i]=a[i-1];
            a[index]=x;
        }
        hienThi(a);
    }
    public static void hienThi(int [] a) {

        for (int b: a) {
            System.out.print(b + " ");
        }
        System.out.println("");
    }




}

