package java8Features;
// predefined functional interface
// used to check condition & return true or false

interface Predicate<T>
 {  boolean test (T t);
 }

public class Predicate1 
{

	public static void main(String[] args)
	{
		 Predicate <Integer> p= (i) -> i>89;
		 
		 boolean c= p.test(250);
		boolean b= p.test(25);
		System.out.println(b);
		System.out.println(c);
		
		String names[]= {"Ram", "Prachi","Aadi","Anant"};
		
		Predicate <String> p1 = (n) -> 
		n.startsWith("A");
		
		for(String n:names)
		{
			if(p1.test(n))
			{
				System.out.println(" " +n);
			}
		}
	}

}
