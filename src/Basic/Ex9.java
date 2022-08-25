package Basic;

import java.util.Scanner;

public class Ex9 {

    public static boolean KiemTraThuanNghich(int n){
        StringBuilder xau = new StringBuilder();
        String s=String.valueOf(n);
        xau.append(s);
        String xauDaoNguoc= "" + xau.reverse();
        if (s.equals(xauDaoNguoc)){
            return true;
        }
        return false;
    }
    public static boolean TongChuSo(int number){
        int sum=0;

        while (number>0) {
            sum+=number%10;
            number= number/10;
        }
        if(sum%10==0){
            return true;
        }
        else return false;
    }
    public static boolean CheckChuSo(int number){
        int sum=0;
        int temp=0;
        while (number>0) {
            temp=number%10;
            number= number/10;
            if(temp!=0 & temp!=6 & temp!=8){
                return false;
            }
            sum+=temp;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        for(number=1000000;number<=999999999;number++){
            if(CheckChuSo(number)& TongChuSo(number)& KiemTraThuanNghich(number)){
                System.out.println(number+"   ");
            }
        }

    }

}
