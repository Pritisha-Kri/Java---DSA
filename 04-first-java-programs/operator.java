//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class operator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int a = sc.nextInt();

        System.out.println("enter the operator (+,-,*,/)");
        char op = sc.next().charAt(0);

        System.out.println("enter second no");
        int b = sc.nextInt();

        switch(op){
            case '+':
                System.out.println("The sum of two no is "+ (a+b));
                break;
            case '-':
                System.out.println("The subtract of two no is "+ (a-b));
                break;
            case '*':
                System.out.println("The multiply of two no is "+ (a*b));
                break;
            case '/':
                System.out.println("The division of two no is "+ (a/b));
                break;
            default:
                System.out.println("ENTER CORRECT OPERATOR");    
        }

        sc.close();

    }

    
}
