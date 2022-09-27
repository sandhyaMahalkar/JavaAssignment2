//Question 10) Write Program Demonstrating use of default 
//Code:-
class B
{
    void s()
    {
        System.out.println("Hey");
    }
}
public class D extends B
{
    public static void main(String args[])
    {
        B a = new B();
        a.s();
    }
}
/*
Output:- 
Hey
*/
