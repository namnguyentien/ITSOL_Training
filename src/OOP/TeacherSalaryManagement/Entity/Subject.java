package OOP.TeacherSalaryManagement.Entity;

import java.util.Scanner;

public class Subject {
    private static int AUTO_ID=100;
    private int id;
    private String subjectName;
    private int numberOfLessons;
    private int numberOfTheoreticalLessons;
    private float expense;


    public int getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        numberOfLessons = numberOfLessons;
    }

    public int getNumberOfTheoreticalLessons() {
        return numberOfTheoreticalLessons;
    }

    public void setNumberOfTheoreticalLessons(int numberOfTheoreticalLessons) {
        this.numberOfTheoreticalLessons = numberOfTheoreticalLessons;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        this.expense = expense;
    }

    public void inputInfo() {
        this.id = this.AUTO_ID;
        this.AUTO_ID++;
        System.out.println("Nhập tên môn học: ");
        this.subjectName = new Scanner(System.in).nextLine();
        System.out.println("Nhập tổng số tiết: ");
        this.numberOfLessons = new Scanner(System.in).nextInt();
        System.out.println("Nhập số tiết lý thuyết: ");
        this.numberOfTheoreticalLessons = new Scanner(System.in).nextInt();
        System.out.print("Nhập mức chi phí: ");
        this.expense = new Scanner(System.in).nextFloat();

    }


    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", numberOfLessons=" + numberOfLessons +
                ", numberOfTheoreticalLessons=" + numberOfTheoreticalLessons +
                ", expense=" + expense +
                '}';
    }
}
