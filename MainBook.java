/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainBook {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Book
        Book sach = new Book();

        // 2. Nhập thông tin sách
        sach.input();

        // 3. Hiển thị thông tin sách
        sach.display();

        // 4. Kiểm tra các điều kiện
        if (sach.isExpensive()) {
            System.out.println("Sach co gia cao");
        }

        if (sach.isOldBook()) {
            System.out.println("Sach xuat ban truoc nam 2015");
        }
    }
    
}
