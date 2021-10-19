package homework;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */


 public class Programme20 {
     public static void main(String args[]){
         int[] array = {15, 78, 86, 69, 46};
          int num = 69;

          for(int i = 0; i<array.length; i++)
          {
              if(num == array[i])
              {
                  System.out.println("Array contains the given element");
              }
              }
          }
      }


