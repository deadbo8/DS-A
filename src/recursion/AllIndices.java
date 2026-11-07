package recursion;

import java.util.Scanner;

public class AllIndices {

    public static  int[] allIndex(int[] arr, int si, int data, int count ){
        if (si == arr.length){
            return new int[count];

        }

        if (arr[si]==data){
            int[] res = allIndex(arr,si+1,data,count+1);
            res[count]= si;
            return res;

        }else{
            return allIndex(arr,si+1,data,count);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {2,8,1,8,8,4};
        int data  =s.nextInt();
        int si =0; int count =0;

        int[] res = allIndex(arr,si,data, count);

        for( int val: res){
            System.out.println(val);
        }
    }
}
