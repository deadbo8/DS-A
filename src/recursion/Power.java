package recursion;

import java.util.Scanner;

public class Power {

    public static int pow(int n, int p){
        if (p==0){
            return 1;
        }
        if (p==1){
            return n;
        }
        return n*pow(n, p-1);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n==1){
            return true;
        }
        for (int i = 1; i <= n/i; i++) {
            if (pow(2, i) == n) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(isPowerOfTwo(131071));

    }
}
