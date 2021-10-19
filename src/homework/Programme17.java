package homework;
/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17 {

    public static void main(String[] args) {
        //defining an array of type string
        String[] name = {"chetan", "jimil", "mehul", "shama", "dhara", "kinjal", "prime"};
        //sorting the array
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        Programme17.numericArray();

            }

    public static void numericArray() {

        int numbers[] = {4, 5, 7, 2, 0, 1, 66, 44};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
