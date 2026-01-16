/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainCar {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng Car với tốc độ ban đầu (ví dụ 80)
        Car myCar = new Car("Toyota", "Camry", 80);

        // 2. Tăng tốc xe
        myCar.accelerate(30);

        // 3. Giảm tốc xe
        myCar.brake(5);

        // 4. Hiển thị trạng thái xe
        myCar.displayStatus();

        // 5. Kiểm tra quá tốc độ
        if (myCar.isOverSpeed()) {
            System.out.println("Xe dang vuot qua toc đo cho phep");
        }
    }
    
}
