//Question 1)write a program to create a vector contaning all the properties of your computer or laptop
//Code:-
import java.util.*;
class vec{
	
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Brand	HP");
		v.add("Model	Pavilion X360");
		v.add("Model Number	X360");
		v.add("Series	Pavilion");
		v.add("Dimensions (mm)	327.41 x 223.50 x 22.61");
		v.add("Weight (kg)	1.97");
		v.add("Colours	Black");
		v.add("Operating system	Windows 11");
		v.add("Battery Cell	3");
		v.add("Processor	Ryzen 5");
		v.add("RAM	8GB");
		System.out.println("HP laptop Properties"+ v +"\n\r" );
	}
}
/*
Output:-
