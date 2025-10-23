package com.example.helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int input = 0;
        do{
            System.out.print("Enter a number:");
            input = scan.nextInt();
            System.out.println("You entered " + input);
        } while (input != 0);
    }
}