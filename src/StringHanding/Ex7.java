package StringHanding;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Nhập 2 chuỗi: ");
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();
        if(s1.indexOf(s2) < 0) {
            System.out.println("Không có chuỗi trùng lặp ");
        }else {
            System.out.println(s1.replaceAll(s2, ""));
        }

    }
}
