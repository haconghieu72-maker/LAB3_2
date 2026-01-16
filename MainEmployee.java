/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainEmployee {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng
        Employee nv = new Employee();

        // 2. Nhập thông tin
        nv.input();

        // 3. Hiển thị thông tin
        nv.display();

        // 4. Tính và xử lý thuế
        double thue = nv.calculateTax();
        
        if (thue == 0) {
            System.out.println("Khong phai dong thue");
        } else {
            System.out.println("So tien thue phai dong " + thue);
        }
    }
    
}
