package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Vahicle
{
	String name;
	String brand;
	public Vahicle(String name, String brand)
	{
		super();
		this.name = name;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vahicle [name=" + name + ", brand=" + brand + "]";
	}
	
}
public class Stream_Terminal

{

	public static void main(String[] args)
	{
		Vahicle v1= new Vahicle("Ram", "Pune");
		Vahicle v2= new Vahicle("Raghav", "Pune");
		Vahicle v3= new Vahicle("Ravi", "Mumbai");
		Vahicle v4= new Vahicle("Rahul", "Delhi");
		Vahicle v5= new Vahicle("Siya", "Pune");
		Vahicle v6= new Vahicle("mercideas", "Sangli");
		
		List <Vahicle> myVahicle = Arrays.asList(v1,v2,v3,v4,v5,v6);
		
		boolean anyMatch = myVahicle.stream().anyMatch(n -> n.brand.equals("Pune") );  // 4] checks condition
		System.out.println("AnyMatch From Pune " + "=" + anyMatch);
		System.out.println( "=============================");
		
		
		boolean noneMatch = myVahicle.stream().noneMatch(n -> n.brand.equals("Sangli") );
		System.out.println("NoMatch From Sangli " + "=" + noneMatch);
		System.out.println( "=============================");
		
		

		boolean allMatch = myVahicle.stream().allMatch(n -> n.brand.equals("Mumbai") );
		System.out.println("allMatch From Mumbai " + "=" + noneMatch);
		System.out.println( "=============================");
		
		List<Vahicle> collect = myVahicle.stream().collect(Collectors.toList() ); //collect your objects
		collect.forEach(f -> System.out.println(f) );
		System.out.println( "=============================");
		
		
		List<String> collect2 = myVahicle.stream()
				
		.filter(t -> t.brand.equals("Pune") )
		.map(t -> t.name   + " =" +   t.name.length())
		.collect(Collectors.toList() );
		
		collect2.forEach(c -> System.out.println(c) );
		
		
		
		
		List<String> BackEnd = Arrays.asList("HTML", "CSS","JavaScript","React", "React");
		BackEnd.stream().skip(1).forEach(u -> System.out.println (u)  );  // 1]
		System.out.println( "=============================");
		
		BackEnd.stream().distinct().forEach(p  -> System.out.println (p)  );  //  2 ]
		System.out.println( "=============================");
		
		
		long count = BackEnd.stream().count();   // 3]
		
		System.out.println(count);
		System.out.println( "=============================");
			
	}

}
