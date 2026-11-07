package recursion;

import java.util.Scanner;

public class FirstIndex {

    public static int idx(int[] arr, int si, int n){
        if (si==arr.length){
            return  -1;
        }
        if (arr[si]==n){
            return si;
        }
        return idx(arr, si+1, n);
    }

    public static void main(String[] args) {
        int[] arr = {6,8,1,1,8,3,4};
        Scanner s = new Scanner(System.in);
        int si = 0;

        int n = s.nextInt();

        System.out.println(idx(arr,si,n));

    }
}
