package StringHanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex6 {
    public static void sapxep(String s){
        StringTokenizer st= new StringTokenizer(s);
        ArrayList<String> array= new ArrayList<>();
        int n= st.countTokens();
        int i=0;
        while(st.hasMoreTokens()){
            String st2=st.nextToken();
            array.add(st2);

        }
        Collections.sort(array);
        System.out.println(array.toString());
    }
    public static void main(String[] args) {
        String s= new String();
        Scanner in= new Scanner(System.in);
        System.out.println("Nhập xâu: ");
        s= in.nextLine();
        sapxep(s);
    }
}

