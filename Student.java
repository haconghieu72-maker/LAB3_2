/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

import java.util.Scanner;
public class Student {

    // Thuộc tính
    String id;
    String name;
    double score;

    // Phương thức nhập thông tin
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh viên (ID): ");
        id = sc.nextLine();
        System.out.print("Nhap ten sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhap điem (Score): ");
        score = sc.nextDouble();
    }

    // Phương thức hiển thị
    void display() {
        System.out.println("--- Thong tin sinh vien ---");
        System.out.println("ID: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Điem: " + score);
    }

    // Phương thức kiểm tra kết quả
    boolean isPass() {
        return score >= 5;
    }
}

