/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author Admin
 */
public class MainBankAccount {
    public static void main(String[] args) {
        // 1. Khởi tạo đối tượng với thông tin ban đầu
        BankAccount account = new BankAccount("123456", "Nguyen Van A", 1000000);

        // 2. Hiển thị thông tin ban đầu
        account.display();

        // 3. Thực hiện các giao dịch
        // Nạp tiền
        account.deposit(500000);
        System.out.println("So du hien tai " + account.checkBalance());

        // Rút tiền
        account.withdraw(200000);
        System.out.println("So du hien tai " + account.checkBalance());
        
        // Rút thử số tiền lớn hơn số dư
        account.withdraw(2000000);
        System.out.println("So du cuoi cung" + account.checkBalance());
    }
}
