package homework;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
double number1,number2,result;
char a;

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter first number: ");
        number1= in.nextDouble();
        System.out.println("Enter second number: ");
        number2=in.nextDouble();
        System.out.println("Enter the operational symbol(+,-,/ or *): ");
        a=in.next().charAt(0);
        if(a != '+' && a !='-'&& a!='/'&& a!='*')
        {
            System.out.println("INVALID ENTRY");}
        else if(a =='+')
        {
            System.out.println("Addition: "+(number1+number2));
        }else if(a=='-')
        {System.out.println("Subtraction: "+(number1-number2));
        }else if (a=='*'){
            System.out.println("Multification: "+(number1*number2));
        }else{
            System.out.println("Division: "+(number1/number2));
        }

    }
}
