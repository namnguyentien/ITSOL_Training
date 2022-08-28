package OOP.TeacherSalaryManagement.Main;

import OOP.TeacherSalaryManagement.Entity.Teacher;
import OOP.TeacherSalaryManagement.Entity.Subject;
import OOP.TeacherSalaryManagement.Entity.Teaching;
import OOP.TeacherSalaryManagement.Service.SubjectService;
import OOP.TeacherSalaryManagement.Service.TeacherService;
import OOP.TeacherSalaryManagement.Service.TeachingService;

import java.util.Scanner;

public class Main {

    public static Subject[] subjects;
    public static Teacher[] teachers;
    public static Teaching[] teachings;

    public static TeacherService teacherService = new TeacherService();
    public static SubjectService subjectService = new SubjectService();
    public static TeachingService teachingService = new TeachingService();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    subjectService.addNewSubject();
                    subjectService.showSubjects();
                    break;
                case 2:
                    teacherService.addNewTeacher();
                    teacherService.showTeachers();
                    break;
                case 3:
                    teachingService.createTeaching();
                    teachingService.showTeachings();
                    break;
                case 4:
                    teachingService.sortTeachingByName();
                    break;
                case 5:
                    teachingService.sortTeachingByTotalLesson();
                    break;

                case 6:
                    teachingService.salaryCalculation();
                    break;
                case 7:
                    System.out.println("Xin cảm ơn đã sử dụng phần mềm của chúng tôi!");
                    return;
            }
        }
    }

    private static int functionChoice() {
        System.out.println("\n\n===== PHẦN MỀM QUẢN LÝ TRẢ LƯƠNG CHO GIẢNG VIÊN =====\n\n");
        System.out.println("1. Nhập danh sách môn học mới.");
        System.out.println("2. In ra danh sách môn học trong hệ thống.");
        System.out.println("3. Nhập danh sách giảng viên mới.");
        System.out.println("4. In ra danh sách giảng viên trong hệ thống.");
        System.out.println("5. Lập bảng kê khai giảng dạy cho giảng viên.");
        System.out.println("6. Sắp xếp danh sách kê khai theo họ tên giảng viên.");
        System.out.println("6. Sắp xếp danh sách kê khai theo số tiết giảng dạy mỗi môn giảm dần    .");

        System.out.println("7. Thoát chương trình");
        System.out.println("--------------------------------------");
        System.out.print("Xin mời nhập lựa chọn của bạn: ");
        int functionChoice = -1;
        do {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 7) {
                break;
            }
            System.out.print("Chức năng được chọn không hợp lệ, vui lòng chọn lại: ");
        } while (functionChoice > 7 || functionChoice < 1);
        return functionChoice;
    }
}

