package StringHanding;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Nhap xau: ");
        String s = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int max=0,i=1,lengthToken;
        max=st.nextToken().length();
        int indexMax=i;
        while (st.hasMoreTokens()) {
            lengthToken=st.nextToken().length();
            i++;
            if(max<lengthToken){
                max=lengthToken;
                indexMax=i;

            }
        }
        System.out.println("Độ dài xâu lớn nhất: "+max+" ở vị trí: "+indexMax);
    }

}
