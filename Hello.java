package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("input your name");
                String name = input.nextLine();

        System.out.println("nice to meet you "+ name);
        }
    }

