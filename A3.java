//Question 3)Write a program to accept the values from the user to command line and display the area of circel,triangle,rectangle,square and polygon 
//Code:--
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1.Area of circle");
        System.out.println("2.Area of triangle");
        System.out.println("3.Area of rectangle");
        System.out.println("4.Area of Square");
        System.out.println("5.Area of Polygon");
        System.out.println("Please enter any of the above option: ");
        int num = sc.nextInt();
        switch(num)
        {
            case 1: System.out.println("Please enter radius of circle: ");
                double radius = sc.nextFloat();
                double areaCircle = (22 * radius * radius) / 7;
                System.out.println("Area of circle is: " + areaCircle);
                break;
            case 2: System.out.println("Please enter base and height of triangle: ");
                double base = sc.nextFloat();
                double height = sc.nextFloat();
                double areaTriangle = (base* height) / 2;
                System.out.println("Area of triangle is: " + areaTriangle);
                break;
            case 3: System.out.println("Please enter length and breadth of rectangle: ");
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                int areaRectangle = length * breadth;
                System.out.println("Area of ractangle is: " + areaRectangle);
                break;
            case 4:
                System.out.print("Please enter the side of the square: ");
                double side = sc.nextDouble();
                double area = side * side;
                System.out.println("The area of the square is " + area);
            case 5:
                System.out.print("Please enter the no.of sides in polygon:");
                int n=sc.nextInt();
                System.out.print("Please enter the length of side in polygon:");
                double ln=sc.nextDouble();
                double angle= Math.toRadians(180/n);
                angle=Math.tan(angle);
                double are =((ln*ln*n)/(4*angle));
                System.out.print("Area of polygon is:"+are);
            default:System.exit(0);
        }
        sc.close();
    }
}
/*Outpute:-
MENU:
1.Area of circle
2.Area of triangle
3.Area of rectangle
4.Area of Square
5.Area of Polygon
Please enter any of the above option: 
1
Please enter radius of circle: 
6
Area of circle is: 113.14285714285714

Process finished with exit code 0
*/
