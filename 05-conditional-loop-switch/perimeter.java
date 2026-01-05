// Perimeter Of Circle
// Perimeter Of Equilateral Triangle
// Perimeter Of Parallelogram
// Perimeter Of Rectangle
// Perimeter Of Square
// Perimeter Of Rhombus

import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Perimeter of Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        double circle = 2 * 3.14 * r;
        System.out.println("Perimeter of Circle = " + circle);

        // Perimeter of Equilateral Triangle
        System.out.print("\nEnter side of equilateral triangle: ");
        double a = sc.nextDouble();
        double triangle = 3 * a;
        System.out.println("Perimeter of Equilateral Triangle = " + triangle);

        // Perimeter of Parallelogram
        System.out.print("\nEnter base of parallelogram: ");
        double b = sc.nextDouble();
        System.out.print("Enter side of parallelogram: ");
        double s = sc.nextDouble();
        double parallelogram = 2 * (b + s);
        System.out.println("Perimeter of Parallelogram = " + parallelogram);

        // Perimeter of Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double br = sc.nextDouble();
        double rectangle = 2 * (l + br);
        System.out.println("Perimeter of Rectangle = " + rectangle);

        // Perimeter of Square
        System.out.print("\nEnter side of square: ");
        double side = sc.nextDouble();
        double square = 4 * side;
        System.out.println("Perimeter of Square = " + square);

        // Perimeter of Rhombus
        System.out.print("\nEnter side of rhombus: ");
        double rs = sc.nextDouble();
        double rhombus = 4 * rs;
        System.out.println("Perimeter of Rhombus = " + rhombus);

        sc.close();
    }
}
