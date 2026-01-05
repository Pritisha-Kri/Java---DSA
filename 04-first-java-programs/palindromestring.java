//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length()- 1;
        boolean isPalindrome= true;

        while (start<end){
            if(str.charAt(start)!= str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
        sc.close();
    }
    
}
