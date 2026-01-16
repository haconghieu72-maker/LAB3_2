/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainCicle {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Circle
        Circle ht = new Circle();

        // 2. Nhập bán kính
        ht.input();

        // 3. In diện tích và chu vi
        System.out.println("Dien tich " + ht.getArea());
        System.out.println("Chu vi " + ht.getPerimeter());

        // 4. Kiểm tra kích thước hình tròn
        if (ht.isBigCircle()) {
            System.out.println("Hinh tron lon");
        } else {
            System.out.println("Hình tron nho");
        }
    }
    
}
