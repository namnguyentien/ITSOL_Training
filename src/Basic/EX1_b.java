package Basic;

import java.util.Scanner;

public class EX1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum=0;
        do {
            System.out.println("Enter number = ");
            n = sc.nextInt();
        }while(n <= 0);
        for(int i = 1; i <= n; i++) {
            sum += (float)1/i;
        }
        System.out.println("Sum = " + sum);
    }
}
