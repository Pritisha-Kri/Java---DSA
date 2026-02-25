import java.util.Scanner;

public class SumNaturalNumbers {

    public static int sumN(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum = " + sumN(n));

        sc.close();
    }
}