package lib;

/*
The insertion sort is an algorithm designed for sorting an array by comparing objects 
and inserting the unordered elements in the postiosn where they belong. This algorithm has a O() 
complexity.
*/
public class InsertionSort {
    /*Sorts using the insertion algorithm 
     * @param array list of integers to sort
     * @returns sorted array(in ascending order)
    */
    public static int[] sort(int[] array){
        //--------------------[Look for analyzing through the array: does it by using bubble]--------------------//
        for(int x=0;x<array.length-1;x++){
            int temp = array[x]; // Temporal value of the current number
            if (array[x]>=array[x+1]){ // Check if the number on the index is bigger than the next one
                array[x] = array[x+1]; // -> Swap the numbers
                array[x+1] = temp; // -> Swap the numbers
                temp = array[x]; // -> Changes the temporal with the swapped number
                int tempIndex = x; // Creates a temporal index to hold the value of the temp to insert
                //--------------------{Loop for inserting the temporal on the correspoding position}--------------------//
                for(int y=x; y>=0;y--){
                    if(array[y]>temp){ //Checks if the previous number on the array is lesser than the temporal
                        array[tempIndex] = array[y]; //Swaps elements
                        array[y] = temp; // Swaps elements
                        tempIndex = y; // Changes the temporal index where the swap ocurred
                    }
                }
                //--------------------{Loop for inserting the temporal on the correspoding position}--------------------//
            }
        }
        //--------------------[Look for analyzing through the array: does it by using bubble]--------------------//
        return array;
    }
}
