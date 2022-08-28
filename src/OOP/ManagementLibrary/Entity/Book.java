package OOP.ManagementLibrary.Entity;

import java.util.Scanner;

public class Book {
    private static int AUTO_ID = -1;

    public static final String KHOA_HOC_TU_NHIEN = "Khoa học tự nhiên";
    public static final String VAN_HOC_NGHE_THUAT = "Văn học-nghệ thuật";
    public static final String DIEN_TU_VIEN_THONG = "Điện tử viễn thông";
    public static final String CONG_NGHE_THONG_TIN = "Công nghệ thông tin";

    private int id;
    private String name;
    private String author;
    private String major;
    private int publishingYear;

    public Book() {
        if (AUTO_ID == -1) {
            AUTO_ID = 10000;
            this.id = AUTO_ID;
            return;
        }
        this.id = ++AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", major='" + major + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }

    public void inputInfo(){
        System.out.println("Nhập tên sách: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên chuyên ngành: ");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học nghệ thuật");
        System.out.println("3. Điện tử viễn thông");
        System.out.println("4. Công nghệ thông tin");
        System.out.print("Xin mời nhập lựa chọn của bạn: ");

        int choice =-1;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 4) {
                break;
            }
            System.out.print("Lựa chọn tên chuyên ngành không hợp lệ, vui lòng chọn lại: ");
        } while (choice > 4 || choice < 1);

        switch (choice){
            case 1:
                this.major=Book.KHOA_HOC_TU_NHIEN;
                break;
            case 2:
                this.major=Book.VAN_HOC_NGHE_THUAT;
                break;
            case 3:
                this.major=Book.DIEN_TU_VIEN_THONG;
                break;
            case 4:
                this.major=Book.CONG_NGHE_THONG_TIN;
                break;
        }

        System.out.println("Nhập năm sản xuất: ");
        this.publishingYear = new Scanner(System.in).nextInt();
    }
}
