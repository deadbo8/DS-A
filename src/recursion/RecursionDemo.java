package recursion;

import java.util.Scanner;

public class RecursionDemo {

    public static void pd(int n){
        if (n<=0 ){
            return;
        }
        System.out.println(n);
        pd(n-2);
//        if (n>=5 ){
//            return;
//        }
//        System.out.println(n+1);

        if (n<5){
            System.out.println(n+1 );
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pd(n);
    }
}
