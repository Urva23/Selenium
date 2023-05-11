package coadingpractice;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=50;
		
		//Arithmetic operators --> + - * % /
		
		System.out.println(a+b); //same result as line #19
		
		System.out.println("Sum of a and b is:" +a+b);  //concatenate
		
		System.out.println("Sum of a and b is:" +(a+b)); //same result as line #13
		System.out.println("Diff of a and b is:" +(b-a));
		System.out.println("Mult of a and b is:" +(a*b));
		System.out.println("Mult of a and b is:" +(a%b));
		System.out.println("Mod div of a and b is:" +(a%b));
		
		///////////////////////////////////////////////////////////
		
		//Relational Operators (Comparison operators)---->   == < >  <=  >=   !=(not equal)
		//Always return Boolean value
		
		System.out.println(a==b); //false
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
		System.out.println(a!=b); //true
		
		//////////////////////////
		
		//Logical operators &&(and)  ||(or)   !(not)
		//works between two Boolean 
		
		boolean x=true;
		boolean y=false;
		System.out.println("---------------Logical operators-------------");
		System.out.println("x && y");  //false
		System.out.println("x || y");  //true
		System.out.println("x ! y");  //false
		System.out.println("x && y");  //false
		
		
		
	}

}
