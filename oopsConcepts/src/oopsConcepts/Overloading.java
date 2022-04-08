package oopsConcepts;
//overloading /compile time polymorphism 

public class Overloading {
	static int add(int a,int b)
	{
		return a+b;
	}  //function declarationand definition for addition of two numbers
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}  //function declarationand definition for addition of three numbers
	
	public static void main(String []args) {
		
		System.out.println(add(12,34));   //method overloading
		System.out.println(add(12,34,23));   //method overloading,we are calling same methods but for different number of arguments
	}
}
