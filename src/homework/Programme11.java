package homework;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11 {

    public static void main(String[] args) {
        for (int i=1;i<=100;i++ )
        {
            if (i%3 ==0 || (i%5==0))
            {
                System.out.println(i);

            }
        }
    }
}
