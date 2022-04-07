package welcomeToJava;
import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args)  {
		long n,sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number you want to check..");
   n=sc.nextLong();
   int i=1;
   sc.close();
   //execute until the condition becomes false
   while(i<=n/2)
   {
	   
	   if(n%i==0) {
		   //calculate sum of factors
		   
		   sum =sum+1;
	   }  //end of if
	   //after each iteration increment the value of variable i by 1
	   i++;
	     
   }//end of while
   //compares sum with the value
   if(sum==n){
   //print if sum and n are equal
   System.out.println(n+" is a perfect number");
   }//end of if
   else
   //prints if sum and n are not equal
   System.out.println(n+" is not perfect number");


   }
}


