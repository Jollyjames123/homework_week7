package homework;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Programme2 {

    public static void main(String[] args) { // main method

        Scanner input = new Scanner(System.in);
        System.out.println("enter year: ");

        int year = input.nextInt();
        input.close();
        boolean leap = false;


        if (year % 4 == 0) {//
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else//
                leap = true;
        } else {//
            leap = false;
        }

        if (leap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}



