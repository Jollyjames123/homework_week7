package homework;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */

import java.util.Scanner;

public class Programme5 {

    static String name;
    static int eid;
    static double basicSalary, hra, ta, da, pf, grossSalary;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        eid = in.nextInt();
        in.nextLine();
        System.out.println("Enter employee name: ");
        name = in.nextLine();
        System.out.println(("Enter basic salary: "));
        basicSalary = in.nextDouble();
        in.close();
        Programme5.salarySlip(); // calling static method
    }

    public static void salarySlip() {

        hra = basicSalary * 0.10;
        ta = basicSalary * 0.08;
        da = basicSalary * 0.09;
        pf = basicSalary * 0.2;
        grossSalary = basicSalary + hra + ta + da - pf;
        System.out.println("_____________________________________");
        System.out.println("|          Salary Slip              |");
        System.out.println("|___________________________________|");
        System.out.println("|Employee ID     :  "+eid+"            |");
        System.out.println("|Employee name   :  "+name+"             |");
        System.out.println("|___________________________________|");
        System.out.println("|Basic Salary    :  "+basicSalary+"         |");
        System.out.println("|HRA 10%         :  "+hra+"          |");
        System.out.println("|TA 8%           :  "+ta+"          |");
        System.out.println("|DA 9%           :  "+da+"          |");
        System.out.println("|PF -20&         :  "+pf+"          |");
        System.out.println("|___________________________________|");
        System.out.println("|Gross Salary    :  "+grossSalary+"         |");
        System.out.println("|===================================|");
    }


}
