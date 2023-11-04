package lib;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

/* 
Code based on a python version made by ChioCode: https://www.youtube.com/watch?v=ACFZn_xQcz8
*/

public class MergeSort {

    // This function appends an element based on the index to which the array has been populated.
    public static int[] append (int[] array, int element, int index) {
        array[index] = element;
        return array;
    }

    // This function is the main Function of the class to sort an array using Merge sort.
    public static int[] sort (int[] arrayToSort) {
        return mergeSort(arrayToSort);
    }

    // This is the main function to split the array in halfs until they are lenght one and then, merge them with the "Merge" function.
    private static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        // Here the arrays are divided.
        int middle = array.length/2;
        int[] leftArray = Arrays.copyOfRange(array, 0, middle);
        int[] rightArray = Arrays.copyOfRange(array, middle, array.length);

        
        int[] sortedLeft = mergeSort(leftArray);
        int[] sortedRight = mergeSort(rightArray);

        return Merge(sortedLeft, sortedRight);
    }

    // This function takes all the individual arrays to merge them in one and finally return the result (sorted array).
    private static int[] Merge(int[] leftArray, int[] rightArray) {
        int index = 0;
        int[] result = new int[leftArray.length + rightArray.length];
        while (leftArray.length > 0 && rightArray.length > 0) {
            if (leftArray[0] > rightArray[0]) {
                result = append(result, rightArray[0], index);
                rightArray = Arrays.copyOfRange(rightArray, 1, rightArray.length);
                index++;
            } else {
                result = append(result, leftArray[0], index);
                leftArray = Arrays.copyOfRange(leftArray, 1, leftArray.length);
                index++;
            }
        }

        while (leftArray.length > 0){
            result = append(result, leftArray[0], index);
            leftArray = Arrays.copyOfRange(leftArray, 1, leftArray.length);
            index++;
        }

        while (rightArray.length > 0) {
            result = append(result, rightArray[0], index);
            rightArray = Arrays.copyOfRange(rightArray, 1, rightArray.length);
            index++;
        }

        return result;
    }
}
