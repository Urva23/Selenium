package coadingpractice;

public class Encapsulation {

	
 private String firstName;
 private String lastName;
 private int age;
 // getter and setter method
 
 
 public String getFirstName()
 {
  return firstName;
  
 }
 
      public void setFirstName(String firstName1 )
 {
      this.firstName = firstName1;
 }

      public static void main(String[] args) {
   // TODO Auto-generated method stub

    	  
  Student s1 = new Student();
        s1.setFirstName("Urvashi");
         System.out.println(s1.getFirstName());
 }

}


