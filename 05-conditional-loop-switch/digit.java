//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the integer");

        int n= sc.nextInt();
        int sum=0;
        int product = 1;

        while (n>0){
            int digit = n%10;
            sum = sum+ digit;
            product = product *digit;
            n = n/10;
        }

        int x= product-sum;
        System.out.println("the Subtract of the Product and Sum of Digits of an Integer " + x);

        sc.close();
          
    }
}
