import java.util.Scanner; 

public class demo{
    public static void main(String args[]){
        
        // 1️⃣ Output in Java
        System.out.println("Welcome to Java!");
        System.out.print("This is without newline ");
        System.out.println("— end of output example.");

        // 2️⃣ Variables and Primitive Data Types
        int age = 20;
        float height = 5.8f;
        double gpa = 3.75;
        char grade = 'A';
        boolean isActive = true;

        System.out.println("\nData Types:");
        System.out.println("Age = " + age);
        System.out.println("Height = " + height);
        System.out.println("GPA = " + gpa);
        System.out.println("Grade = " + grade);
        System.out.println("Active = " + isActive);

        // 3️⃣ Input from User
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        System.out.println("\nHello " + name + "! You entered number " + number);

        // 4️⃣ Type Conversion & Casting
        int x = 100;
        double y = x;   // Automatic conversion (int → double)
        System.out.println("\nAutomatic conversion: double y = " + y);

        double z = 99.99;
        int t = (int) z; // Explicit casting (double → int)
        System.out.println("Explicit casting: int t = " + t);

        // 5️⃣ 🔥 Automatic Type Promotion in Expressions
        /*
           Rules:
           - byte, short, and char are automatically promoted to int
           - If any operand is long → result is long
           - If any operand is float → result is float
           - If any operand is double → result is double
        */

        byte b = 10;
        char c = 'A';   // ASCII value of 'A' is 65
        short s = 20;
        int result1 = b + c + s;
        // b, c, and s are promoted to int before calculation

        System.out.println("\nAutomatic Type Promotion:");
        System.out.println("b + c + s = " + result1);

        int i = 50;
        float f = 5.5f;
        double d = 30.25;

        double result2 = i + f + d;
        // int → float → double (final result is double)

        System.out.println("i + f + d = " + result2);

        // ❌ This would cause error:
        // byte b2 = b + 1;  // result becomes int
        byte b2 = (byte) (b + 1); // Explicit casting needed
        System.out.println("After casting, byte b2 = " + b2);

        // 6️⃣ Conditional Statements
        if (number % 2 == 0) {
            System.out.println("\nNumber is even");
        } else {
            System.out.println("Number is odd");
        }

        // 7️⃣ Loops
        System.out.println("\nFor-loop example:");
        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

        System.out.println("\nWhile-loop example:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // 8️⃣ Close Scanner
        sc.close();
    }
}