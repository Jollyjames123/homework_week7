package homework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

public class Programme1 {

        public static void main(String[] args) {//main method

            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = reader.nextInt(); //input number
            reader.close();

            String number = (num % 2 == 0) ? "even" : "odd";

            System.out.println(num + " is " + number);

        }
    }



