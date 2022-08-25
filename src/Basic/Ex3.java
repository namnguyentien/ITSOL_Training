package Basic;

import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
        int firstNumber, secondNumber, temp1, temp2, uscln, bscnn;
        Scanner scanner = new Scanner(System.in);

        do{
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();}while (firstNumber<0 ||secondNumber<0);



        // tìm ước số chung lớn nhất
        temp1 = firstNumber;
        temp2 = secondNumber;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        uscln = temp1;

        System.out.println("Ước số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " + uscln);
        System.out.println("Bội số chung lớn nhất của " + firstNumber + " và " + secondNumber + " = " +
                ((firstNumber * secondNumber) / uscln));
    }


}
