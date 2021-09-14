/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */


import java.util.Scanner;


public class Main {
    public static void main(String args[])
    {
        String knownPassword  = "abc$123";   //assigned knownPassword to a string 
        System.out.print("Enter your Username : ");
        Scanner s = new Scanner(System.in);    //uses scanner to scan the user input 
        String username = s.nextLine();
        
        System.out.print("What is the password ? : ");
        String password = s.nextLine();
        
        
        
        if(knownPassword.equals(password)) //uses if statement to determine what to print
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
     
    }
    
}
