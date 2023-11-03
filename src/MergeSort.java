import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class MergeSort {

    public static int[] append (int[] array, int element, int index) {
        array[index] = element;
        return array;
    }

    public static int[] sort (int[] arrayToSort) {
        return mergeSort(arrayToSort);
    }
    private static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int middle = array.length/2;
        int[] leftArray = Arrays.copyOfRange(array, 0, middle);
        int[] rightArray = Arrays.copyOfRange(array, middle, array.length);

        int[] sortedLeft = mergeSort(leftArray);
        int[] sortedRight = mergeSort(rightArray);

        return Merge(sortedLeft, sortedRight);
    }

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
