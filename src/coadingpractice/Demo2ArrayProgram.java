package coadingpractice;

public class Demo2ArrayProgram {

	public static void main(String[] args) {
		
		
		int [] marks = {22, 23, 21, 31, 32, 2}; // size is fixed while declaration
		  
		  int size = marks.length;
		  
		  System.out.println("Array of Marks");
		  
		  for(int i=0; i<size;i++)
		  {
		   System.out.println(marks[i]);
		   
		  }
		  
		  marks[2] = 35;
		  marks[4]= 3;
		  
		   size = marks.length;
		  
		  System.out.println("Marks after change");
		  for(int i=0; i<size;i++)
		  {
		   System.out.println(marks[i]);
		   
		  }
		  
		  double d[] = {11.22, 21.23, 23.25, 33.45};
		  char [] ch = {'a', 'e','f', 'r', 'y'};
		  
		  String names[] = {"Ajay", "Urvashi", "Sarita", "Anita"};
		  
		  for(int i=0; i<names.length;i++)
		  {
			  System.out.println(names[i]);
			   
		  }
		  
		  int[] age = { 22, 25, 35, 40};
		   size = age.length;
		  
		  System.out.println("Array of Age");

		
		  
		 }

		
		

	}


