package com.bridgelabz.day11and12.stockmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
    ArrayList<String> nameOfStock=new ArrayList<String>();
    ArrayList<Integer>numOfShare=new ArrayList<Integer>();
    ArrayList<Integer>priceOfShare=new ArrayList<Integer>();

    public void addingStocks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stock Name : ");
        nameOfStock.add(sc.next());
        System.out.println("Enter the number of shares : ");
        numOfShare.add(sc.nextInt());
        System.out.println("Enter the share price : ");
        priceOfShare.add(sc.nextInt());
    }

    public void stockReport(){
        System.out.println("_________Stock Report__________");
        for (int i = 0; i < nameOfStock.size() ;i++){
            int total = numOfShare.get(i) * priceOfShare.get(i);
            System.out.println("Stock Name= " +nameOfStock.get(i) + "\nValue of each share= " +priceOfShare.get(i)
                    +"\nTotal value of share= " +total);
        }
    }
}
