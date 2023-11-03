//---------{This file is a template>>Use this one for testing the algorithms}--------//

import java.util.Random;
import lib.*;

public class Main{
  
    public static void main(String[] args){
        //-------------------------[Create the test arrays]-------------------------//
        int n = 10; // Size of the array to sort
        int[] arr = randomArray(n); // Set the array n size
            // Show the array1 before sorting
            System.out.println("Original array:\n");
            int counter = 0;
            for(int num:arr){
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
        
        // >>> Selection Sort <<< 
            /*long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = SelectionSort.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;*/
        // >>> Bubble Sort <<<
            /*long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = BubbleSort.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;*/
        // >>> Insertion Sort <<<
            long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = InsertionSort.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;
        // >>> Merge Sort <<<
            /*long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = Merge.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;*/
        // >>> Shell Sort <<<
            /*long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = ShellSort.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;*/
        // >>> Quick Sort <<<
            /*long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = QuickSort.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;*/
        // >>> Radix Sort <<<
            /*long start = System.currentTimeMillis(); //Time at the start of the algorithm
            arr = RadixSort.sort(arr); // Change the array for the one to sort
            long end = System.currentTimeMillis(); //Time after it finished sorting the array
            long elapsedTime = end-start; //Total time it take
            System.out.println("Your algorithm took:"+elapsedTime+" ms to sort the array. Result: \n");
            for(int num:arr){
                if (counter==20){
                    System.out.print("\n");
                    counter=0;
                }
                System.out.print(num+", ");
                counter++;
            }
            System.out.println("\n");
            counter = 0;*/

        
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
