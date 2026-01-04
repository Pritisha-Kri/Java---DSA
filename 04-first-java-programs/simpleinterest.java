//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class simpleinterest {
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal , rate , time period to calculate simple interest");

        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t= sc.nextFloat();

        float si = (p*r*t)/100;
        System.err.println("the simple interest is"  + si);

        sc.close();
    }
}
