package coadingpractice;

public class Student {
	 
	 int age;        //instance variable of class / data members
	 String name;
	 String school;
	 String standard;
	 
	 
	 void showDetails()      // methods of class       
	 {
	  System.out.println("Student Age : "+age);
	  System.out.println("Name : "+name);
	  System.out.println("School : "+school);
	  System.out.println("Standard: "+standard);
	  
	 }
	 
	 public static void main(String args[])
	 {
	  Student s1 = new Student(); // object is created - 
	  // memory is allocated for age and name
	  
	  s1.age=10;
	  s1.name="Sudha";
	  s1.school="Mody University";
	  s1.standard="5B";
	  s1.showDetails();
	  
	  //ClassName objectName = new ClassName();
	  
	  
	  
	  
	  
	 }

	}

