/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.tranthanh;

import java.util.Scanner;
 /* Lab2
 * Ask user to input 3 integers and output the numbers in ascending order along with the sum
 * Author: Thanh Tran
 * Date: October 1, 2018
 */

public class Lab2TranThanh {

    public static void main(String[] args) {
   
        int n, n2, n3;  // declares the 3 variables
        
        Scanner input = new Scanner (System.in);    //create scanner
        System.out.println("Please enter 3 integer values: ");  // ask user for the integers
        n = input.nextInt();    // get input for variable n
        n2 = input.nextInt();   // get input for variable n2
        n3 = input.nextInt ();  // get input for variable n3
        
        int sum = n + n2 + n3;  // get sum of all inputs
        
        System.out.printf("Numbers entered by user: %7d %7d %7d\n", n, n2,n3); // print out all numbers entered
        
        // print out numbers in ascending order depending on the numbers entered
        if (n2 < n3 && n3 < n) {
            System.out.printf("Numbers in ascending order: %7d %7d %7d\n", n2, n3, n);
        }
        else if (n < n2 && n2 < n3) {
            System.out.printf("Numbers in ascending order: %7d %7d %7d\n", n, n2 , n3);
        }
        else if (n2 < n && n < n3) { 
            System.out.printf("Numbers in ascending order: %7d %7d %7d\n", n2, n, n3);
        }
        else if (n3 < n && n < n2) { 
            System.out.printf("Numbers in ascending order: %7d %7d %7d\n", n3, n, n2);
        }
        else if (n3 < n2 && n2 < n) { 
            System.out.printf("Numbers in ascending order: %7d %7d %7d\n", n3, n2, n);
        }
        else if (n < n3 && n3 < n2) { 
            System.out.printf("Numbers in ascending order: %7d %7d %7d\n", n, n3, n2);
        }
        
        System.out.printf ("Sum of numbers: %-7d\n", sum);  // print out sum of numbers
        System.out.println ("Thank you for using the program"); // end program with Thank you for using program */
    
    }
    
}
