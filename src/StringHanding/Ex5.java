package StringHanding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex5 {

    public static void chuyenDoi(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuffer result= new StringBuffer();
        String s1[]= new String[20];
        int i=1;
        while(st.hasMoreTokens()){
            s1[i]= st.nextToken();
            i++;

        }
        result.append(s1[3]).append("...");
        result.append(s1[1]).append("...");
        result.append(s1[2]).append("...");
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = new String();
        System.out.println("Nhap ho ten: ");
        s= new Scanner(System.in).nextLine();
        chuyenDoi(s);

    }
}
