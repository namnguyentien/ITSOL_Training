package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX10 {

    public static boolean isPrimeNumber(int n) {

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDigit(int n) {
        int balance;

        while (n > 0) {
            balance = n % 10;
            for (int i = 2; i <= (int) Math.sqrt(balance); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            n = n / 10;
        }return true;

    }


    private static int reverse_num(int n){
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        for(int n=1000000;n<=9999999;n++){
            if(isPrimeNumber(n)){
                int temp=reverse_num(n);
                if(isPrimeNumber(temp)){
                    if(checkDigit(temp)){
                        System.out.println(n+" ");
                    }
                }
            }

        }
    }
}

