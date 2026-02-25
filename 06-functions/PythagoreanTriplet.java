import java.util.Scanner;

public class PythagoreanTriplet {

    public static boolean isPythagorean(int a, int b, int c) {
        return (a*a + b*b == c*c) ||
               (a*a + c*c == b*b) ||
               (b*b + c*c == a*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isPythagorean(a, b, c))
            System.out.println("Pythagorean Triplet");
        else
            System.out.println("Not a Pythagorean Triplet");

        sc.close();
    }
}