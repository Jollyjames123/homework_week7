package homework;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {

        public static void main(String[] args) {
            //Initialize array
            int [] array = new int [] {5, 2, 3, 6, 10};
            int sum = 0;
            //Loop to calculate sum of elements
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Sum of all the elements of an array: " + sum);
        }

}
