/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainProduct {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Product
        Product sp = new Product();

        // 2. Nhập thông tin sản phẩm
        sp.input();

        // 3. Hiển thị thông tin sản phẩm
        sp.display();

        // 4. In tổng tiền sản phẩm
        System.out.println("Tong tien san pham " + sp.getTotalPrice());

        // 5. Giảm giá 10% và hiển thị lại
        sp.discount(10);
        System.out.println("Thong tin sau khi giam gia 10% phan trăm");
        sp.display();
        
        // In lại tổng tiền sau khi đã giảm giá
        System.out.println("Tong tien moi sau giam gia " + sp.getTotalPrice());
    }
}
    

