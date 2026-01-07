import java.util.Scanner;

class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks " + i + ": ");
            sum += sc.nextInt();
        }

        double average = (double) sum / n;

        System.out.println("Average Marks = " + average);

        sc.close();
    }
}
