package Basic;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count=0;
        do{
            System.out.println("Enter number: ");
            n = sc.nextInt();
        }while (n<=0);
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("\n"+count);
    }
}
