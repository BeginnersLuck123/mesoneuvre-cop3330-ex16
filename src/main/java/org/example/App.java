package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner(System.in);
        System.out.println( "What is your age?" );
        int age = input.nextInt();//Input
        //Using IF/ELSE statement to determine if user is old enough to legally drive
        if(age >= 16)
        {
            System.out.println("You are old enough to legally drive.");//Output
        }
        else
        {
            System.out.println("You are not old enough to legally drive.");//Output
        }
    }
}
