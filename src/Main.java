//---------{This file is a template>>Use this one for testing the algorithms}--------//

import java.util.Random;
import lib.*;

public class Main{
  
    public static void main(String[] args){
        //-------------------------[Create the test arrays]-------------------------//
        int[] arr1 = randomArray(5); // First array
            // Show the array1 before sorting
            int counter = 0;
            for(int num:arr1){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;

        int[] arr2 = randomArray(10); // Second array
            // Show the array2 before sorting
            for(int num:arr2){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;


        int[] arr3 = randomArray(20); // Third array
            // Show the array3 before sorting
            for(int num:arr3){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;

        //-------------------------[Test all array with a selected algoritm]-------------------------//
        // NOTE: De-commentate the desired algorithm to sort the array with the one of your desire

        // >>> Bubble Sort <<<

        // >>> Insertion Sort <<<

        // >>> Merge Sort <<<

        // >>> Shell Sort <<<

        // >>> Radix Sort <<<

        
    }

    /*Creates an array of size N filled with random integers
    * @param size length of the array
    * @returns array with integers
    */
    private static int[] randomArray(int size){
        Random integer = new Random(); //Random class instance for generating random values
        int[] array = new int[size];
        for(int x=0;x<=size-1;x++){
            array[x] = integer.nextInt(1000); // Creates a random number between 0 and 1000(can be changed if desired) at the current index(x)
        }
        return array;
    }
}
