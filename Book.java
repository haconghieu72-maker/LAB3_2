/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.util.Scanner;
public class Book {
    // Thuộc tính
    String title;
    String author;
    double price;
    int year;

    // Phương thức nhập thông tin
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach Title ");
        title = sc.nextLine();
        System.out.print("Nhap tac gia Author ");
        author = sc.nextLine();
        System.out.print("Nhap gia tien Price ");
        price = sc.nextDouble();
        System.out.print("Nhap nam xuat ban Year ");
        year = sc.nextInt();
    }

    // Hiển thị thông tin (Không dùng dấu ngăn cách)
    void display() {
        System.out.println("Title " + title + " Author " + author + " Price " + price + " Year " + year);
    }

    // Kiểm tra giá cao (trên 200.000)
    boolean isExpensive() {
        return price > 200000;
    }

    // Kiểm tra sách cũ (trước năm 2015)
    boolean isOldBook() {
        return year < 2015;
    }
    
}
