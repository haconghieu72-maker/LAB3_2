/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.util.Scanner;
public class Circle {
    // Thuộc tính
    double radius;

    // Phương thức nhập thông tin
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh radius ");
        radius = sc.nextDouble();
    }

    // Phương thức tính diện tích: S = PI * r^2
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính chu vi: P = 2 * PI * r
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Kiểm tra diện tích có lớn hơn 100 hay không
    boolean isBigCircle() {
        return getArea() > 100;
    }
}
    
