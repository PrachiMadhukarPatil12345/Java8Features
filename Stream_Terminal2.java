package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;





class Employees
{
	String EmpName;
	String Dept;
	@Override
	public String toString()
	{
		return "Employees [EmpName=" + EmpName + ", Dept=" + Dept + "]";
	}
	public Employees(String empName, String dept)
	{
		super();
		EmpName = empName;
		Dept = dept;
	}
}



class Book
{
	String name;
	double price;
	public Book(String name, double price)
	{
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Book [name=" + name + ", price=" + price + "]";
	}
}
public class Stream_Terminal2
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Journey_Home",600);
		Book b2 = new Book("Ishopanishad",100);
		Book b3 = new Book("Bhgavatam",2000);
		Book b4 = new Book("B.Gita",600);
		Book b5 = new Book("VrajMandalParikrama",700);
		Book b6 = new Book("Krishnaa",150);
		Book b7 = new Book("Radhaa",800);
		
		List <Book> mybooklist =Arrays.asList(b1,b2,b3,b4,b5,b6,b7);
		 Stream<Book> stream = mybooklist.stream();
		 stream.filter(b -> b.price>=200).map(b ->b.name + "=" + b.price).forEach(b ->System.out.println(b) );
		 
		 
		 
		 System.out.println("====================================================");
		 
		 
		 
		 Employees e1= new Employees("Prachi", "IT");
		 Employees e2= new Employees("Radhaai", "CSE");
		 Employees e3= new Employees("Vrindaa", "Electicl");
		 Employees e4= new Employees("Prutha", "IT");
		 
		 List < Employees> myEmplist =Arrays.asList(e1,e2,e3,e4);
		 myEmplist.stream().filter(f ->f.Dept=="IT").map(f ->f.EmpName.toUpperCase() ).forEach(f ->System.out.println(f) );
	
		 
		 System.out.println("====================================================");
		 
		 

	}
}
