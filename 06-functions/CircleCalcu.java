import java.util.Scanner;

public class CircleCalcu {

    public static double area(double r) {
        return Math.PI * r * r;
    }

    public static double circumference(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Area = " + area(r));
        System.out.println("Circumference = " + circumference(r));

        sc.close();
    }
}