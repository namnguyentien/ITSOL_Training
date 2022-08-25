package Basic;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,sum=0;
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
        } while (number < 0);
        while (number>0) {
            sum+=number%10;
            number= number/10;
        }
        System.out.println("Sum: "+sum);
    }
}
