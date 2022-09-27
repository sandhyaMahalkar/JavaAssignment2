/*Question 6)Write a program to create account package containing the class which accepts TA DA HRA and 
 to calculate net or gross salary (assuming diduction propertinal taz incoe tax 10%)*/
//code:-
package account;
import java.util.Scanner;
class A
{
	public void salary()
	{
		float bs,ta,da,hra,grs,pf,nets;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Basic Salary");
		bs = s.nextFloat();

		hra = (15f*bs)/100;
		System.out.println("HRA:- "+hra);

		ta = (2f*bs)/100;
		System.out.println("TA:-"+ta);

		da = (5f*bs)/100;
		System.out.println("DA:- "+da);

		pf = (12.5f*bs)/100;

		grs = bs+da+hra+ta+pf;
		System.out.println("Gross Salary:- "+grs);

		nets = grs - pf;
		System.out.println("Net salary:- "+nets);


	}
	public static void main(String[] args) {
		A a = new A();
		a.salary();

	}
}

/*
Output:-
Enter Your Basic Salary
1000
HRA:- 150.0
TA:-20.0
DA:- 50.0
Gross Salary:- 1345.0
Net salary:- 1220.0
*/
