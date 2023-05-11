package coadingpractice;

public class Constructors {

	int age;        //instance variable of class / data members
	 String name;
	 
	
	 
	  void showDetails() // methods of class       
	 {
	  System.out.println("Student Age : "+age);
	  System.out.println("Name : "+name);
	  
	  
	 }
	 
	 public static void main(String args[])
	 {
	  Student student1 = new Student(); // object is created - 
	  // memory is allocated for age and name
	  //constructor is called / executed / invoke 
	  
	  
	  student1.showDetails();
	  Student student2 = new Student (); //object is created
	  Student student3 = new Student (); //object is created 
	  
	  student2.showDetails();
	  student3.showDetails();
	 
	  //ClassName objectName = new ClassName();
	 
	  
	 }

	}

	
	
	
	
	
	
	

	


