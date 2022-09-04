package StringHanding;

public class Ex1 {
    public static boolean kiemtrathuannghich(int n){
        StringBuilder xau = new StringBuilder();
        String s=String.valueOf(n);
        xau.append(s);
        String xauDaoNguoc= "" + xau.reverse();
        if (s.equals(xauDaoNguoc))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int n;
        for(n=100000;n<=999999;n++){
            if(kiemtrathuannghich(n)){
                System.out.println(n+" ");
            }
        }

    }
}
