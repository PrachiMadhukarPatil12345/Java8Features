package java8Features;

import java.util.ArrayList;
import java.util.List;

class Employee1
{
	int id;
	String name;
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
public class FunctionalIntrface8
{
	@FunctionalInterface
	interface Test
	{
		void TakeEmployees (List<Employee>employee);
	}
	
	public static void main(String[] args)
	{
		List l1=new ArrayList();
		
		Employee1 e1= new Employee1(1," zxcvv");
		l1.add(e1);
		
		l1.add(new Employee1(2,"Prchi"));
		
		l1.add(new Employee1(3,"bnmmlkj"));
	
		Test t=(List<Employee>employee)->
		{
			System.out.println(l1);
		};
	t.TakeEmployees(l1);
}
}
