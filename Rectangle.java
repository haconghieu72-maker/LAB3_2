/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.util.Scanner;
public class Rectangle {
    // Thuộc tính
    double length;
    double width;

    // Phương thức nhập thông tin
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai (Length): ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong (Width): ");
        width = sc.nextDouble();
    }

    // Phương thức tính diện tích: S = dài * rộng
    double getArea() {
        return length * width;
    }

    // Phương thức tính chu vi: P = (dài + rộng) * 2
    double getPerimeter() {
        return (length + width) * 2;
    }

    // Phương thức hiển thị theo đúng cú pháp yêu cầu
    void display() {
        System.out.println("Length: " + length + " – Width: " + width);
    }
}
    

