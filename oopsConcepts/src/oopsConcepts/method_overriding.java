package oopsConcepts;

class Employee{
float salary = 40000;
void incrementSalary()
{
System.out.println("The Employee incremented salary is :" +(salary + (salary * 0.2)) );
}
}
class PermanentEmp extends Employee{
double hike = 0.5;
void incrementSalary()
{
System.out.println("The Permanent Employee incremented salary is :" +(salary + (salary * hike)) );
}
}
class TemporaryEmp extends Employee{
double hike = 0.35;
void incrementSalary()
{
System.out.println("The Temporary Employee incremented salary is :" +(salary + (salary * hike)) );
}
}

public class method_overriding {

	public static void main(String[] args) {
		Employee e =new Employee( );
		PermanentEmp p = new PermanentEmp();
		TemporaryEmp t = new TemporaryEmp();
		// based on an object it decide which class incrementSalary() method to be execute
		e.incrementSalary();
		p.incrementSalary();
		t.incrementSalary();

	}

}
