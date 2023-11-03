package lib;

import java.util.Arrays;
// Source code from: https://www.geeksforgeeks.org/java-program-for-radix-sort/

/*
 * Sorts an array using the Radix sort algorithm that consists on sorting an array n times by arranging the
 * numbers based on the digits; it compares a digit and sorts it on one iteration and then moves to the next
 * one. The max number of iterations is given by the number with the highest amount of digits. It has a complexity
 * of O(k*n)
*/
public class RadixSort {

    /*  Sorts the array using the RadixSort algorithm
     * @returns sorted array of integers
    */
    public static int[] sort(int[] array){
        //Analyze the given array
        int iterations = maxOf(array);
        int[] sorted = sort_aux(array, iterations);
        return sorted;
    }
    /* Auxiliar function; executes the code of the sorting algorithm
     * @param array array of integers that is going to be sorted
     * @param iterations max number of digits
     * @returns sorted array
    */
    private static int[] sort_aux(int[] array, int total){
        // Do counting sort for every digit. Note that instead 
        // of passing digit number, exp is passed. exp is 10^i 
        // where i is current digit number 
        for (int exp = 1; total/exp > 0; exp *= 10){
            countSort(array, array.length, exp); 
        }
        return array;
    }

    // A function to do counting sort of arr[] according to 
    // the digit represented by exp. 
    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
 
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
 
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
 
        // Build the output array 
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
 
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to current digit 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 

    /* This method gets the max number of digits contained in the array
     * @param array list of integers to read
     * @returns int value of the digits
     */
    private static int maxOf(int[] array){
        int max = 0; //Sets a default value of the max number
        //------------------------------{Loop for retrieving the biggest number}------------------------------//
        for(int number:array){
            if (number>max){
                max = number; //Swaps the max value with the one read from the array
            }
        }
        //------------------------------{Loop for retrieving the biggest number}------------------------------//
        return max;
    }
}
