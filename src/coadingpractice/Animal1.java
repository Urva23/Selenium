package coadingpractice;

public class Animal1 {
	
	int age;
	String breed;
	String type;
	String gender;
	
	void showdetail()
	{
		System.out.println("Animal Age : "+age);
	    System.out.println("Type : "+type);
	    System.out.println("Breed : "+breed);
	    System.out.println("Gender : "+gender);
	    
	}
	public static void main(String args[])
	{
	
		Animal1 a1 = new Animal1();
		
		a1.age = 2;
		a1.type = "Dog";
		a1.breed = "German Shepherd";
		a1.gender = "Female";
		a1.showdetail();
	}
}

