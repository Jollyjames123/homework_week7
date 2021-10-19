package homework;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

public class Programme19 {
    public static void main(String[] args) {
        double[] arr = {10, 20, 30, 40.5, 50};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }


        double average = total / arr.length;

        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.println("The average is: " + average);
    }
}

