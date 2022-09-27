//Question 7) write a program to demonstrate use of private access specifier/modifier
//Code:-
class Demo
{
  int marks = 50;
  static int price = 70;
  public static void main(String args[])
  {
    Demo d1 = new Demo();
    System.out.println("d1.marks: "+ d1.marks);       // marks called with object d1
    System.out.println("price: " + price);            // price called without object d1
  }
}
/*
Output:-
d1.marks: 50
price: 70

Process finished with exit code 0
*/
