package com.example.demo;

import java.util.List;

public class StatementPrinter {
    public static void print(List<Transaction> transactions) {
        System.out.println("Date       | Amount | Balance");
        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction t = transactions.get(i);
            System.out.println(t.getDate() + " | " + t.getAmount() + " | " + t.getBalance());
        }
    }
}
