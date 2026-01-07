import java.util.Scanner;

class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost: ");
        double cost = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();

        double depreciation = (cost * rate * time) / 100;

        System.out.println("Depreciation = " + depreciation);

        sc.close();
    }
}
