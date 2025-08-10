package MethodsInJava;

public class Methodoverloading1 {
    static double area(double length, double breadth)
    {
        return length*breadth;
    }
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    static double area(double a, double b, double h)
    {
        return ((a+b)*h)/2;
    }
    
    public static void main(String args[])
    {
        System.out.println("The area of a circle is "+area(7));
        System.out.println("The area of a rectangle is "+area(63, 12));
        System.out.println("The area of a trapezium is "+area(5, 10, 7));
    }
}
