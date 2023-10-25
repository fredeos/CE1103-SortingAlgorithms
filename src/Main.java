//------{This file is a template>>Use this one for testing the algorithms}------//
import lib.*;

public class Main{
    public static void main(String[] args){
        int[] testArray = {5,4,1,27,8,1};
        testArray = ShellSort.sort(testArray);
        for (int num:testArray){
            System.out.print(num+", ");
        }
        System.out.print("\n");
    }
}
