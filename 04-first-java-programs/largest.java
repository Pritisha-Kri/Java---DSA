import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two nos u want to compare");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("A is the largest "+ a);
        }
        else{
            System.out.println("B is the largest "+b);
        }
        sc.close();
    }
}
