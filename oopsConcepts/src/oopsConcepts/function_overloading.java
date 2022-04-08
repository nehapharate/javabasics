package oopsConcepts;

class Adder
{
static int multiply(int a,int b)
{
return a*b;
}
static int multiply(int a,int b,int c)
{
return a*b*c;}
}

public class function_overloading {

	public static void main(String[] args) {
		System.out.println(Adder.multiply(11,10));
		System.out.println(Adder.multiply(11,10,11));
		
	}

}
