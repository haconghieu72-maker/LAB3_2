/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.util.Scanner;
public class Product {
    // Thuộc tính
    String id;
    String name;
    double price;
    int quantity;

    // Phương thức nhập thông tin
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham id ");
        id = sc.nextLine();
        System.out.print("Nhap ten san pham name ");
        name = sc.nextLine();
        System.out.print("Nhap gia san pham price ");
        price = sc.nextDouble();
        System.out.print("Nhap so luong quantity ");
        quantity = sc.nextInt();
    }

    // Tính tổng tiền
    double getTotalPrice() {
        return price * quantity;
    }

    // Phương thức giảm giá (Thay đổi trực tiếp giá sản phẩm)
    void discount(double percent) {
        price = price - (price * percent / 100);
    }

    // Hiển thị thông tin (Bỏ các dấu ngăn cách)
    void display() {
        System.out.println("id " + id + " Name " + name + " Price " + price + " Quantity " + quantity);
    }
}
    

