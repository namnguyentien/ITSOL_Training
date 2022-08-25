package Basic;

import java.util.Scanner;

public class Ex6 {
    public static void phanTich(int n){
        int i=2;
        while(n>1){
            if(isPrimeNumber(i)){
                if(n%i==0){
                    System.out.print(i+" ");
                    n/=i;
                }
                else
                    i++;
            }
            else
                i++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n= nhap();
        System.out.print("n= " );
        phanTich(n);
    }

}


