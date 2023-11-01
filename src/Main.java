//------{This file is a template>>Use this one for testing the algorithms}------//
import lib.*;

public class Main{
    public static void main(String[] args){
        int[] listToSort = {21, 807, 101, 57, 40, 7, 2};
        int[] sorted = RadixSort.sort(listToSort);
        for (int num:sorted){
            System.out.print(num + ", ");
        }
        System.out.println("\n");
        
    }
}
