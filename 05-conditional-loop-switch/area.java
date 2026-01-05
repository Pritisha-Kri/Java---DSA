// Area Of Circle Java Program
// Area Of Triangle
// Area Of Rectangle Program
// Area Of Isosceles Triangle
// Area Of Parallelogram
// Area Of Rhombus
// Area Of Equilateral Triangle

public class area{
    public static void main(String[] args){

        //circle
        int r=7;
        double area_c = 3.14*r*r;
        System.out.println("Area of circle" + area_c);

        //triangle and isiceles triangle
        int b = 24, h= 23;
        double area_t = 0.5*b*h;
        System.out.println("Area of triangle" + area_t);
        System.out.println("Area of isoceles triangle" + area_t);

        // rectangle
        int l =43, br=23;
        double area_r = l*br;
        System.out.println("area of rectangle" +area_r);

        //parallelogram
        int ba= 12, he = 13;
        int area_p =ba*he;
        System.out.println("Area of parallelogram" + area_p);

        //rhombus
        System.out.println("Area of rhombus" + area_p);

        //equileteral triangle
        int a =6;
        double area_eq = (Math.sqrt(3)/4)*a*a;
        System.out.println("area of equilateral traingle is" + area_eq);
    }
}