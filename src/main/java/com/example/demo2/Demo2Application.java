package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.util.Scanner;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);

        System.out.println("hello");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        System.out.println(a+"ba ");
    }






}
