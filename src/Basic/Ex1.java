package Basic;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n;
        int sumOdd=0;
        int sumEven=0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter number: ");
            n = scanner.nextInt();
        } while (n < 1);

        for(int i=0;i<=n;i++){
            if(n%2==0 & i%2==0){
                sumEven+=i;
            }
            if(n%2!=0 & i%2!=0){
                sumOdd+=i;
            }
        }
        if(n%2==0)
            System.out.println(sumEven);
        else
            System.out.println(sumOdd);

    }
}
