package coadingpractice;

public class Employee extends Student {

	String phone;
	 String email;
	 String id;
	 
	 void showDetails()
	 {
		 
	  super.showDetails();
	  System.out.println("Phone = " +phone);
	  System.out.println("Email = "+email);
	  System.out.println("Emp Id = "+id);
	  
	   }
	
	public static void main(String[] args) {
		 Employee e1 = new Employee();
		  
		  e1.age =22;
		  e1.name="Swati";
		  e1.id ="AB202";
		  e1.email = "test@tewm.com";
		  e1.phone = "+761 786 988";
		  e1.showDetails();
		
		
	}

}
