import java.util.Scanner;
 
/*
 * Java Program to find largest and smallest of three numbers
 */
public class LargestandSmallest {
 
    public static void main(String args[]) {
 
        // creating scanner to accept radius of circle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Java program to find large and smallest of three numbers");
 
        System.out.println("Please enter first number :");
        int first = scanner.nextInt();
 
        System.out.println("Please enter second number :");
        int second = scanner.nextInt();
 
        System.out.println("Please enter third number :");
        int third = scanner.nextInt();
 
        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
 
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);
 
        scanner.close();
    }
 

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
 
        if (third > max) {
            max = third;
        }
 
        return max;
    }
 
   
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
 
        if (third < min) {
            min = third;
        }
 
        return min;
    }
}