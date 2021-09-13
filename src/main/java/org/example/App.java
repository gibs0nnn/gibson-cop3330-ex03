package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nathaniel Gibson
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("What is the quote? ");
        String quote = scanner.nextLine();
        System.out.print("Who said it? ");
        String name = scanner.nextLine();

        //Display output
        System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
