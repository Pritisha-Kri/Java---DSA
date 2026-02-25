import java.util.Scanner;

public class EvenOdd {

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEvenOdd(num);

        sc.close();
    }
}