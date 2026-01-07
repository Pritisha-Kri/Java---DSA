import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        double result = Math.pow(base, exp);

        System.out.println("Power = " + result);

        sc.close();
    }
}
