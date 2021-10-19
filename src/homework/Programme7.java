package homework;
/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Programme7 {
    public static void main(String [] args) {
        Scanner input= new Scanner(System.in);
        int id;
        String name;
        double sales, basic,comsn;

        System.out.print("Enter sales ID: ");
        id=input.nextInt();
        input.nextLine();
        System.out.print("Enter seller's name: ");
        name=input.nextLine();
        System.out.print("Enter sales amount: ");
        sales=input.nextDouble();
        System.out.print("Enter basic salary: ");
        basic=input.nextDouble();
        input.close();
        if (sales>=50000)
        {
            System.out.println("Sales Commission is: "+(sales*0.35));
        }else if(sales>=30000 && sales<50000)
        {
            System.out.println("Sales Commission is: "+(sales*0.20));
        }else if(sales>=20000 && sales<30000)
        {
            System.out.println("Sales Commission is: "+(sales*0.10));
        }else if(sales>=10000 && sales<20000)
        {
            System.out.println("Sales Commission is: "+(sales*0.05));
        }else
        {
            System.out.println("Sales Commission is: "+(sales*0.02));
        }

    }
}
