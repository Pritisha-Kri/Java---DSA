import java.util.Scanner;

class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point " + i + ": ");
            sum += sc.nextDouble();
        }

        double cgpa = sum / n;

        System.out.println("CGPA = " + cgpa);
        sc.close();
    }
}
