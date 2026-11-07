package recursion;

import java.util.Scanner;

public class Factorial {

    public static int fac( int n){
        if (n==0){
            return 1;
        }
        return fac(n-1)*n;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n =4;
        int prod = fac(n);
        System.out.println(prod);
    }
}
