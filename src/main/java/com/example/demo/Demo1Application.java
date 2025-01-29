package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        AccountService account = new Account();


        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);


        account.printStatement();
    }

}
