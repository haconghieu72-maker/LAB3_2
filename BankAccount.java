/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.util.Scanner;
public class BankAccount {
    // Thuộc tính
    String accountNumber;
    String ownerName;
    double balance;

    // Hàm khởi tạo (Constructor)
    BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        ownerName = name;
        balance = bal;
    }

    // Nạp tiền
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nap tien thanh cong " + amount);
        }
    }

    // Rút tiền (Chỉ rút khi đủ số dư)
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rut tien thanh cong " + amount);
        } else {
            System.out.println("Rut tien that bai So tien khong du");
        }
    }

    // Trả về số dư hiện tại
    double checkBalance() {
        return balance;
    }

    // Hiển thị thông tin (Không dùng dấu ngăn cách phức tạp)
    void display() {
        System.out.println("STK " + accountNumber + " Chu Tai Khoan " + ownerName + " So du " + balance);
    }
}
    
