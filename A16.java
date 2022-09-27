//Question 16)Write a program to demonstrating multiple inheritance using interfaces
//Code:- 
interface Rectangle
{
    void drawrectangle();
}
interface Circle
{
    void drawcircle();
}
class D implements Rectangle,Circle
{
    public void drawrectangle()
    {
        System.out.println("Drawing rectangle");
    }
    public void drawcircle()
    {
        System.out.println("Drawing circle");
    }
    public static void main(String args[])
    {
        D m = new D();
        m.drawrectangle();
        m.drawcircle();
    }
}

/*
Output:-
Drawing rectangle
Drawing circle
*/
