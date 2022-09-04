package StringHanding;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Nhap xau: ");
        String s = new Scanner(System.in).nextLine();
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] temp = s.split(" ");
        s = "";
        for (int i = 0; i < temp.length; i++) {
            s += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                s += " ";
        }
        System.out.println(s);
    }

}
