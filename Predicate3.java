package java8Features;
import java.util.function.Predicate;

class Employee3
{
	String name;
	String city;
	String Department;
	public Employee3(String name, String city, String department)
	{
		super();
		this.name = name;
		this.city = city;
		this.Department = department;
	}
	@Override
	public String toString()
	{
		return "Employee3 [name=" + name + ", city=" + city + ", Department=" + Department + "]";
	}
	
}
//interface Predicate<T>
//{
//	boolean Test (T t);
//	
//}



public class Predicate3
{
	
	
	public static void main(String[] args)
	{
		Employee3 e1= new Employee3("Prachi","Sangli","IT");
		Employee3 e2= new Employee3("Smita","SanFrnsoskoi","CSIT");
		Employee3 e3= new Employee3("Ram","Sangli","Electrical");
		Employee3 e4= new Employee3("Siya","Punei","civil");
		Employee3 e5= new Employee3("Raaaj","Mumbaii","Mechanical");
		
		Employee3 [] s= {e1,e2,e3,e4,e5};
		
		
		Predicate<Employee3> emp=(empdetails) -> empdetails.city.equals("Sangli")
		 ||  (empdetails.Department.equals("IT"));
				
		
		Predicate<Employee3> emp2=(empdetails) -> empdetails.name.startsWith("S");
		
		// Predicate  joining
				Predicate<Employee3> joined = emp.or(emp2);
				
				
		{
			for(Employee3 values:s)
			{
				if(joined.test(values))
						{
					     System.out.println(values);
						}
			}
			
		};
		
		
	}

}
