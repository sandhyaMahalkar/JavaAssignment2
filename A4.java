//Question 4)Write a program to demonstrating partial abstract class
//Code:-
abstract class A
{
    abstract void s1();
    abstract void s2();
    void display(){
        System.out.println("In abstract class A");
    }
}
abstract class B extends A{
    void s1(){
        System.out.println("in abstract s1");
    }
}
class C extends B{
    void s2(){
        System.out.println("In abstract s2");
    }
}
class Ab{
    public static void main(String[] args) {
        C c = new C();
        c.s1();
        c.s2();
        c.display();
    }
}
/*
Output:-
in abstract s1
In abstract s2
In abstract class A

Process finished with exit code 0
*/
