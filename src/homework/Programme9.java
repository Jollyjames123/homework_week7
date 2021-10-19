package homework;
/**
 * 9. Input any alphabet from “A" to “F” and print their city name accordingly (use SWITCH statement) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        char cityInitial;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F: ");
        cityInitial = input.next().charAt(0);
        switch (cityInitial){
            case 'A':  case 'a':
                System.out.println("Ahmedabad");
                break;
            case 'B':  case 'b':
                System.out.println("Berlin");
                break;
            case 'C':  case 'c':
                System.out.println("Chernobyl");
                break;
            case 'D':  case 'd':
                System.out.println("Doha");
                break;
            case 'E':  case 'e':
                System.out.println("Edmonton");
                break;
            case 'F':  case 'f':
                System.out.println("Florence");
                break;
            default:
                System.out.println("INVALID ENTRY");

        }
    }
}
