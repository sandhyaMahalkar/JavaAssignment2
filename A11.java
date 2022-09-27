//Question 11)write a java program to calculate area of class1 triangle, class2 circle, class3 square, class4 rectangle,class5 polygon
//Code:-
import java.util.Scanner;

class Triangle
{
    void t()
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("Please enter base and height of triangle: ");
        double base = sc.nextFloat();
        double height = sc.nextFloat();
        double areaTriangle = (base * height) / 2;
    System.out.println("Area of triangle is: " + areaTriangle);
    }
}
class Rectangle extends Triangle
{
    void r() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length and breadth of rectangle: ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int areaRectangle = length * breadth;
        System.out.println("Area of ractangle is: " + areaRectangle);
    }
}
class Cirlce extends Rectangle
{
    void c() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of circle: ");
        double radius = sc.nextFloat();
        double areaCircle = (22 * radius * radius) / 7;
        System.out.println("Area of circle is: " + areaCircle);
    }
}
class Square extends Cirlce
{
    void s() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the lenght of side in square: ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("The area of the square is " + area);
    }
}
class Polygon extends Square
{
    void a() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no.of sides in polygon:");
        int n = sc.nextInt();
        System.out.print("Please enter the length of side in polygon:");
        double ln = sc.nextDouble();
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        double are = ((ln * ln * n) / (4 * angle));
        System.out.print("Area of polygon is:" + are);
    }
}
class D{
    public static void main(String[] args) {
        Polygon p = new Polygon();
        p.t();
        p.r();
        p.s();
        p.a();
        p.c();
    }
}

/*
Output:-
Please enter base and height of triangle: 
3
6
Area of triangle is: 9.0
Please enter length and breadth of rectangle: 
5
9
Area of ractangle is: 45
Please enter the lenght of side in square: 9
The area of the square is 81.0
Please enter the no.of sides in polygon:6
Please enter the length of side in polygon:5
Area of polygon is:64.9519052838329Please enter radius of circle: 
*/
