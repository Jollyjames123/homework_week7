package homework;
/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Programme16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        if (num > 0)
        {
            System.out.println("POSITIVE");
        }else if (num<0)
        {
            System.out.println("NEGATIVE");
        } else
        {
            System.out.println("ZERO");
        }
    }
}
