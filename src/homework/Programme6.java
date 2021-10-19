package homework;
/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme6 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        input.close();
        if(num%2==0){
            System.out.println("The entered number is even");
        }else
        {
            System.out.println("The entered number is odd");
        }
    }
}
