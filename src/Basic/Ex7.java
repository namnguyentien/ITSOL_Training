package Basic;

public class Ex7 {
    public static boolean isPrimeNumber(int n) {

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkOdd(int n) {
        if(n%2==0){
            return false;
        }
        else
        return true;
    }

    public static void main(String[] args) {
        for (int n = 100000; n <= 999999; n++) {
            if(isPrimeNumber(n)&checkOdd(n)){
                System.out.println(n+"  ");
            }
        }
    }
}
