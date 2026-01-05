//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class largeofall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int max = Integer.MIN_VALUE;
        ;

        while (true) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
            System.out.println("The large of all no is "+ max);
        }
        sc.close();
    }

}