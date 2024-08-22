package meow;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

import java.util.*;

public class Sazon_Q1AAPe1 {
    public static void main(String[] args) {
        String first_twenty[] = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Nineteen", "Twenty"
        };
        
         Scanner sysIn = new Scanner(System.in);
         
         System.out.print("Enter a Number from 1-99: ");
         int userInt = sysIn.nextInt();
        
         int ones = userInt % 10;
         
         if (userInt > 90){
            System.out.println("Ninety " + first_twenty[ones]);
            System.exit(0);
         }
         
         if (userInt > 80){
            System.out.println("Eighty " + first_twenty[ones]);
            System.exit(01);
         }
         
         if (userInt > 70){
            System.out.println("Seventy " + first_twenty[ones]);
            System.exit(0);
         }
         
         if (userInt > 60){
            System.out.println("Sixty " + first_twenty[ones]);
            System.exit(0);
         }
         
         if (userInt > 50){
            System.out.println("Fifty " + first_twenty[ones]);
            System.exit(0);
         }
         
         if (userInt > 40){
            System.out.println("Fourty " + first_twenty[ones]);
            System.exit(0);
         }
         
         if (userInt > 30){
            System.out.println("Thirty " + first_twenty[ones]);
            System.exit(0);
         }
         
         if (userInt > 20){
            System.out.println("Twenty " + first_twenty[ones]);
            System.exit(0);
         }

         else{
             System.out.println(first_twenty[userInt]);
         }
    }
}

