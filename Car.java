/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;


public class Car {
    // Thuộc tính
    String brand;
    String model;
    int speed;

    // Hàm khởi tạo
    Car(String br, String md, int sp) {
        brand = br;
        model = md;
        speed = sp;
    }

    // Phương thức tăng tốc
    void accelerate(int value) {
        speed += value;
        System.out.println("Da tang toc them " + value);
    }

    // Phương thức giảm tốc (vận tốc không được nhỏ hơn 0)
    void brake(int value) {
        speed -= value;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Da giam toc di " + value);
    }

    // Hiển thị trạng thái xe (Bỏ các dấu ngăn cách)
    void displayStatus() {
        System.out.println("model " + model + " Speed " + speed);
    }

    // Kiểm tra quá tốc độ (trên 100)
    boolean isOverSpeed() {
        return speed > 100;
    }
    
}
