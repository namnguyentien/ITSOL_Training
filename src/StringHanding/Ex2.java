package StringHanding;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Nhap xau: ");
        String s = new Scanner(System.in).nextLine();
        dinhDang(s);
    }
    public static void dinhDang(String s){
        String b[] = new String[256];
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            b[i] = String.valueOf(a[i]);
        }
        for(int i=0; i<a.length; i++) {
            if(i%2 == 0) {
                b[i] = b[i].toUpperCase();
            }else {
                b[i] = b[i].toLowerCase();
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.print(b[i]);
        }



    }
}
