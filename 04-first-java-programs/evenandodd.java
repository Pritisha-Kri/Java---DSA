//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner; 

public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        int num = sc.nextInt();
        if (num %2 ==0){
            System.out.println("even no");
        }
        else{
            System.out.println("odd no");
        }
        sc.close();
    }
    
}
