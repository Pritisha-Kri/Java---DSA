//Input currency in rupees and output in USD.

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter rupee");
        float rupee = sc.nextFloat();
        double usd = rupee/ 89.75;

        System.out.println(rupee +" rupee to us dollar "+ usd);

        sc.close();
    }
    
}
