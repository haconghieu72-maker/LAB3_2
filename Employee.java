/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;
import java.util.Scanner;
public class Employee {
    // Thuộc tính
    String id;
    String name;
    double salary;

    // Phương thức nhập thông tin
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien ID ");
        id = sc.nextLine();
        System.out.print("Nhap ten nhan vien Name ");
        name = sc.nextLine();
        System.out.print("Nhap luong Salary ");
        salary = sc.nextDouble();
    }

    // Phương thức hiển thị (Đã loại bỏ tất cả dấu : và -)
    void display() {
        System.out.println("ID " + id + " Name " + name + " Salary " + salary);
    }

    // Phương thức tính thuế (10% nếu lương > 10 triệu)
    double calculateTax() {
        if (salary > 10000000) {
            return salary * 0.1;
        } else {
            return 0;
        }
    }
    
}
