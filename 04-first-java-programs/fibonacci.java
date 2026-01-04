//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n no if fibonacci series");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int i;
        for (i = 0; i < n; i++) {
            System.out.println("the fibonacci series is " + a);
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }

}
