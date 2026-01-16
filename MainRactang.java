/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainRactang {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Rectangle
        Rectangle hcn = new Rectangle();

        // 2. Nhập chiều dài và chiều rộng
        hcn.input();

        // 3. Hiển thị thông tin
        hcn.display();

        // 4. Tính và in ra kết quả
        System.out.println("Dien tich: " + hcn.getArea());
        System.out.println("Chu vi: " + hcn.getPerimeter());
    }
}
    
