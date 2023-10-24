package lib;

/*
The insertion sort is an algorithm designed for soting an array by comparing objects 
and inserting the unordered elements in the postiosn where they belong. This algorithm has a O() 
complexity.
*/
public class InsertionSort {
    /*Sorts using the insertion algorithm 
     * @param array list of integers to sort
     * @returns sorted array(in ascending order)
     * 
    */
    public static int[] sort(int[] array){
        return sort_aux(array, 0);
    }
    
    /*Actual sorting algorithm*/
    private static int[] sort_aux(int[] array, int index){
        //Base case, end of the lsit
        if(index==array.length-1){
            return array;
        }
        //Recursive case
        else {
            int temp = array[index];
            if(temp>=array[index+1]){//The selected temporal value is greater than the next one; must do swap
                array[index] = array[index+1];
                array[index+1] = temp;
                int[] insertionList = insertion(array, array[index], index);
                return sort_aux(insertionList, index+1);
            }else{ ///The list stays the same; temporal is ordered
                return sort_aux(array, index+1);
            }
        }
    }
    
    /*Checks backwards if the swapped element must be inserted at the correct place*/
    private static int[] insertion(int[] array, int insertionElement ,int index){
        //Base case
        if (index==0){
            return array;
        }
        //Recursive case
        else {
            if (insertionElement<array[index-1]){
                array[index] = array[index-1];
                array[index-1] = insertionElement;
                return insertion(array, array[index-1], index-1);
            }else{
                return array;
            }
        }
    }
}
