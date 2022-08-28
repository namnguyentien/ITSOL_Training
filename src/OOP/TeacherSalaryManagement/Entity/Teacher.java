package OOP.TeacherSalaryManagement.Entity;

import java.util.Scanner;

public class Teacher extends Person {

    public static final String GS_TS = "Giáo sư - Tiến sĩ";
    public static final String PGS_TS = "Phó giáo sư - Tiến sĩ";
    public static final String GIANG_VIEN_CHINH = "Giảng viên chính";
    public static final String THAC_SI = "Thạc sĩ";

    private static int AUTO_ID = 100;

    private int idTeacher;
    private String level;


    public int getIdTeacher() {
        return idTeacher;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }


    public void inputInfo(){
        this.idTeacher = this.AUTO_ID;
        this.AUTO_ID++;
        super.inputInfo();
        System.out.println("Nhập trình độ giảng viên: ");
        System.out.println("1. Giáo sư - Tiến sĩ ");
        System.out.println("2. Phó giáo sư - Tiến sĩ");
        System.out.println("3. Giảng viên chính");
        System.out.println("4. Thạc sĩ");
        System.out.print("Xin mời nhập lựa chọn của bạn: ");

        int choice =-1;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }
            System.out.print("Lựa chọn trình độ của giảng viên không hợp lệ, vui lòng chọn lại: ");
        } while (choice > 4 || choice < 1);

        switch (choice){
            case 1:
                this.level= Teacher.GS_TS;
                break;
            case 2:
                this.level= Teacher.PGS_TS;
                break;
            case 3:
                this.level= Teacher.GIANG_VIEN_CHINH;
                break;
            case 4:
                this.level= Teacher.THAC_SI;
                break;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idTeacher=" + idTeacher +
                ", level='" + level + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
