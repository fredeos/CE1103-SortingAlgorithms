package lib;

/*
The ShellSort algorithm consists of calculating gaps between far elements and 
swapping them by including an insertion sort inside, this algorithm has a
complexity of O(n*3) being a cubic complexity.
*/
public class ShellSort {

    /*Sorts the array using the shellsort algorithm 
     * @param array desired array to sort
     * @returns sorted array
    */
    public static int[] sort(int[] array){
        int len = array.length; //max length of the array
        //----------------------------[Main loop: Calculates the gap distance]----------------------------//
        for (int gap=len/2; gap>0;gap/=2){
            //----------------------------[Secondary loop: Iterates over the elements on the right of the gap]----------------------------//
            for (int x=gap;x<len;x++){
                int temp = array[x]; //Saves a element on the right to a temporal
                int y; //Index of the postion where the temp will be inserted
                //----------------------------[Secondary loop: Iterates over the elements on the right of the gap]----------------------------//
                for(y=x;y >= gap && temp < array[y - gap];y-=gap){ //Only if the opposite element of the gap is greater than the one save of the temporal
                    array[y] = array[y-gap]; //Swaps opposite end of the gap with the actual value of the temporal
                    //After the iteration completes saves the 'y' index after taking the gap
                }
                //----------------------------[Secondary loop: Iterates over the elements on the right of the gap]----------------------------//
                array[y] = temp; //Inserts the saved temporal
            }
            //----------------------------[Secondary loop: Iterates over the elements on the right of the gap]----------------------------//
        }
        //----------------------------[Main loop: Calculates the gap distance]----------------------------//
        return array;//Returns the sorted array
    }
}
