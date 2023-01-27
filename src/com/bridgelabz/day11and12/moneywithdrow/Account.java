package com.bridgelabz.day11and12.moneywithdrow;

import java.util.Scanner;

public class Account {
    private int savingMoney = 1000;

    public int getSavingMoney() {
        return savingMoney;
    }

    public void withdrawMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Money you want Withdraw");
        int withdrawMoney = scanner.nextInt();
        if (withdrawMoney <= getSavingMoney()){
            int balance = getSavingMoney() - withdrawMoney;
            System.out.println("Debit is successfully of amount: " + getSavingMoney());
            System.out.println("Total amount left after withdrawal: " + balance);
        } else
            System.out.println("Debit amount exceeded account balance");

    }

    public static void main(String[] args) {
        Account balance=new Account();
        balance.withdrawMoney();
    }
}
