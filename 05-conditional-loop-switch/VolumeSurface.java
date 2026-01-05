// Volume Of Cone Java Program
// Volume Of Prism
// Volume Of Cylinder
// Volume Of Sphere
// Volume Of Pyramid
// Curved Surface Area Of Cylinder
// Total Surface Area Of Cube

import java.util.Scanner;

class VolumeSurface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Volume of Cone
        System.out.print("Enter radius of cone: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cone: ");
        double h = sc.nextDouble();
        double cone = (1.0 / 3) * 3.14 * r * r * h;
        System.out.println("Volume of Cone = " + cone);

        // Volume of Prism
        System.out.print("\nEnter base area of prism: ");
        double baseArea = sc.nextDouble();
        System.out.print("Enter height of prism: ");
        double heightPrism = sc.nextDouble();
        double prism = baseArea * heightPrism;
        System.out.println("Volume of Prism = " + prism);

        // Volume of Cylinder
        System.out.print("\nEnter radius of cylinder: ");
        double cr = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double ch = sc.nextDouble();
        double cylinder = 3.14 * cr * cr * ch;
        System.out.println("Volume of Cylinder = " + cylinder);

        // Volume of Sphere
        System.out.print("\nEnter radius of sphere: ");
        double sr = sc.nextDouble();
        double sphere = (4.0 / 3) * 3.14 * sr * sr * sr;
        System.out.println("Volume of Sphere = " + sphere);

        // Volume of Pyramid
        System.out.print("\nEnter base area of pyramid: ");
        double pyramidBase = sc.nextDouble();
        System.out.print("Enter height of pyramid: ");
        double pyramidHeight = sc.nextDouble();
        double pyramid = (1.0 / 3) * pyramidBase * pyramidHeight;
        System.out.println("Volume of Pyramid = " + pyramid);

        // Curved Surface Area of Cylinder
        System.out.print("\nEnter radius for curved surface area of cylinder: ");
        double csr = sc.nextDouble();
        System.out.print("Enter height for curved surface area of cylinder: ");
        double csh = sc.nextDouble();
        double csaCylinder = 2 * 3.14 * csr * csh;
        System.out.println("Curved Surface Area of Cylinder = " + csaCylinder);

        // Total Surface Area of Cube
        System.out.print("\nEnter side of cube: ");
        double side = sc.nextDouble();
        double cube = 6 * side * side;
        System.out.println("Total Surface Area of Cube = " + cube);

        sc.close();
    }
}


