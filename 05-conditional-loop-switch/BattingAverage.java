import java.util.Scanner;

class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter matches played: ");
        int matches = sc.nextInt();

        double average = (double) runs / matches;

        System.out.println("Batting Average = " + average);
        sc.close();
    }
}
