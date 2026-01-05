//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

class factor
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no");
        int n= sc.nextInt();

        System.out.print("the factors are");
        for(int i =1 ; i<=n ;i++){
            if(n%i==0){
                System.err.println(i);
            }
        }
        sc.close();

    }
}