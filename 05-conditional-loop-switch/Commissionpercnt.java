import java.util.Scanner;

class Commissionpercnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter commission %: ");
        double rate = sc.nextDouble();

        double commission = sales * rate / 100;

        System.out.println("Commission = " + commission);

        sc.close();
    }
}
