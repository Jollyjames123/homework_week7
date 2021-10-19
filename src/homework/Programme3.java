package homework;

/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme3 {

    static int rollNo, math, science, english, total;
    static double percentage;
    static String name, result, grade;


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = in.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = in.nextInt();
        System.out.print("Enter Maths Marks: ");
        math = in.nextInt();
        /*if (math < 0 || math > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }*/
        System.out.print("Enter Science Marks: ");
        science = in.nextInt();
        /*if (science < 0 || science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }*/
        System.out.print("Enter English Mark: ");
        english = in.nextInt();
        /*if (english < 0 || english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }*/
        in.close();
        total = math + science + english;
        percentage = total / 3;
        if (percentage >= 35) {
            result = "Pass";
        } else
            result = "Fail";
        showGrade(); //calling method
        if (math < 0 || math > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100"); //error message
        } else {
            printMarkSheet(); //printing the marksheet
        }
    }

    public static void showGrade() {
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        } else {
            grade = "FAIL";
        }
    }

    public static void printMarkSheet() {

        System.out.println("________________________________________");
        System.out.println("|                                      |");
        System.out.println("|             Mark Sheet               |");
        System.out.println("|______________________________________|");
        System.out.println("|   Name       :       " + name + "             |");
        System.out.println("|   Roll No    :       " + rollNo + "               |");
        System.out.println("|______________________________________|");
        System.out.println("|   Subjects   :      Marks            |");
        System.out.println("|______________________________________|");
        System.out.println("|   Math       :      " + math + "               |");
        System.out.println("|   Science    :      " + science + "               |");
        System.out.println("|   English    :      " + english + "               |");
        System.out.println("|______________________________________|");
        System.out.println("|   Total      :      " + total + "              |");
        System.out.println("|______________________________________|");
        System.out.println("|   Percentage :      " + percentage + "             |");
        System.out.println("|   Result     :      " + result + "             |");
        System.out.println("|   Grade      :      " + grade + "               |");
        System.out.println("|______________________________________|");

    }


}
