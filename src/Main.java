//------{This file is a template>>Use this one for testing the algorithms}------//

import java.util.Random;
import lib.*;

public class Main{
    public static void main(String[] args){
        int[] list = {127,1,30,40,57,21,2,3,1};
        list = InsertionSort.sort(list);
        for (int x:list){
            System.out.print(x + ",");
        }
        System.out.print("\n");
    }
}
