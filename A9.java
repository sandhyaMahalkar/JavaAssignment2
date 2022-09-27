//Question 9) Write Program Demonstrating use of privete
//Code:-
class B
{
    protected void s()
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
