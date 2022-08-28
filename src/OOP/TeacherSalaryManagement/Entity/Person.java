package OOP.TeacherSalaryManagement.Entity;

import java.util.Scanner;

public class Person {
    protected String fullName;
    protected String address;
    protected String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public void inputInfo(){
        System.out.print("Nhập tên giảng viên: ");
        this.fullName = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.print("Nhập SĐT: ");
        this.phoneNumber = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
