package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return USCLN(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number = ");
        int secondNumber = sc.nextInt();
        for(int i= firstNumber;i<secondNumber;i++){
            for(int j = i+1;j<secondNumber;j++){
                if(USCLN(i,j)==1){
                    System.out.println(i+"-"+j);
                }
            }
        }



    }
}
