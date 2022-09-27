//Question 8)Write a program Demonstrating use of public 
//Code:- 
//package s containing public class D1
package s;  
public class D1   
{   
public void show()   
{   
System.out.println("hello");   
}   
}   

\\Second code to call D1, D1 is a public class because it's a public class we can call it any where in other class ,package every where. 
  
package s2;
import s.*;  
class B   
{   
public static void main(String args[])   
{   
D1 obj = new D1();   
obj.show();   
}   
}  

/*
Outpute:-
hello
*/

//another Example of public class
//Code:-
class B 
{   
//defining method as private  
public void s()   
{   
System.out.println("Hey");   
}   
}   
public class D  
{   
public static void main(String args[])   
{   
B a = new B();   
//trying to access private method of the class Demo1  
a.s();   
}   
}

/*
output:-
Hey
*/
