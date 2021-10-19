package homework;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {

        char cityInitial;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F: ");
        cityInitial = input.next().charAt(0);

        if(cityInitial =='A'|| cityInitial =='a')
        {
            System.out.println("Athens");
        }else if(cityInitial =='B'|| cityInitial== 'b')
        {
            System.out.println("Berlin");
        }else if (cityInitial =='C'|| cityInitial== 'c')
        {
            System.out.println("Chernobyl");
        }else if(cityInitial =='D'|| cityInitial== 'd')
        {
            System.out.println("Doha");
        }else if (cityInitial =='E'|| cityInitial== 'e')
        {
            System.out.println("Edmonton");
        }else if (cityInitial =='F'|| cityInitial== 'f')
        {
            System.out.println("Florence");
        }else
        {
            System.out.println("INVALID ENTRY");
        }

    }

}
