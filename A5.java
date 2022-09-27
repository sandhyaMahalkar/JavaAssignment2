//Question 5)Write a program to Demonstrate full abstract class
//Code:-
abstract class Base {
    abstract void fun();
}
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
class Main {
    public static void main(String args[])
    {
        Base b = new Derived();
        b.fun();
    }
}
/*
Derived fun() called

Process finished with exit code 0
*/
