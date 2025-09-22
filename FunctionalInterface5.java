package java8Features;

class Employee extends Object
{
	int EmpId;
	String Department;
	
	public Employee(int empId, String department) {
		super();
		EmpId = empId;
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", Department=" + Department + "]";
	}
	
}
/*{
	float salary;
	String name;
	public Employee(float salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	
	  // @Override
	public String toString()
	{  return "Employee [salary=" +
	  salary + ", name=" + name + "]"; 
	}*/
	 	 	
public class FunctionalInterface5
{
	@FunctionalInterface
	interface mydemo
	{
		Employee [] getEmployee();
	}
	
	public static void main(String[] args)
	{ Employee e1=new Employee(1, "AI");
	 Employee e2=new Employee(2, "CSE");
	 Employee e3=new Employee(6,"IT");
		
		mydemo md= ()->
		{
			return new  Employee[] {e1,e2,e3};
			
		};
	Employee[] em =md.getEmployee();
		
	for(Employee i:em)
	{
		//System.out.println(i);
		System.out.println(i.EmpId + " id ");
		System.out.println(i.Department+ "  dept");
		System.out.println("========================================");
	}
		
	
	
		/*
		 * mydemo md=()-> { Employee e2= new Employee((float) 89.90, "Adityai");
		 * e1.name="Prchi"; e1.salary=700; return e2;
		 * 
		 * }; Employee e =md.getEmployee(); System.out.println(e);
		 * System.out.println(e1);
		 */
	}

}
