package java8Features;

import java.util.Arrays;
import java.util.List;

class Person
{   String name;
	int Age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		Age = age;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", Age=" + Age + "]";
	}
}


public class Predicate2
{
	interface Predicate<T>
	{
		boolean Test(T t);
	}
	
	
	public static void main(String[] args)
	{
		Person p1= new Person("Akshayaa",40);
	Person p2= new Person("shreayaa",40);
	Person p3= new Person("kshamaa",40);
	Person p4= new Person("Aradhayaa",30);
	
	List <Person> persons=Arrays.asList(p1,p2,p3,p4);
	
		 Predicate<Person> p = (a)-> a.Age>35;
		 {
			for(Person pr :persons)
			{
				if( p.Test(pr))
				{
					System.out.println(pr);
				}
			}
			 
		 };
		
	}

}
