package recursion;

import java.sql.Array;
import java.util.Scanner;

public class isArraySorted {

    public static boolean isSorted(int[] arr, int si){
        if ( si == 0){
            return true;
        }

        boolean compare = arr[si]>=arr[si-1];
        return compare && isSorted(arr,si-1);


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {11,8,9,10,11,12};
        int si = 5;
        System.out.println(isSorted(arr, si));
    }
}
