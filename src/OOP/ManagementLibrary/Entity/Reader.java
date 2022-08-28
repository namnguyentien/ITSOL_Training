package OOP.ManagementLibrary.Entity;

import java.util.Scanner;

public class Reader {
    // dùng hằng số static final
    public static final String SINH_VIEN = "Sinh viên";
    public static final String HOC_VIEN_CAO_HOC = "Học viên cao học";
    public static final String GIAO_VIEN = "Giáo viên";

    private static int AUTO_ID = -1;

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String readerCategory;

    public Reader() {
        if(AUTO_ID==-1){
            AUTO_ID=10000;
            this.id=AUTO_ID;
            return;
        }
        this.id=++AUTO_ID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReaderCategory() {
        return readerCategory;
    }

    public void setReaderCategory(String readerCategory) {
        this.readerCategory = readerCategory;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", readerCategory='" + readerCategory + '\'' +
                '}';
    }
    public void inputInfo(){
        System.out.println("Nhập tên bạn đọc: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ bạn đọc: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập số điện thoại bạn đọc: ");
        this.phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giáo viên");
        System.out.print("Xin mời nhập lựa chọn của bạn: ");

        int choice =-1;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 3) {
                break;
            }
            System.out.print("Lựa chọn loại bạn đọc không hợp lệ, vui lòng chọn lại: ");
        } while (choice > 3 || choice < 1);

        switch (choice){
            case 1:
                this.readerCategory=Reader.SINH_VIEN;
                break;
            case 2:
                this.readerCategory=Reader.HOC_VIEN_CAO_HOC;
                break;
            case 3:
                this.readerCategory=Reader.GIAO_VIEN;
                break;
        }

    }
}
