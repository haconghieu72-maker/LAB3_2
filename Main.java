/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student();
        
        sv.input();
        sv.display();

        if (sv.isPass()) {
            System.out.println("Sinh vien DAT ");
        } else {
            System.out.println("Sinh vien KHONG DAT");
        }
    }
}
