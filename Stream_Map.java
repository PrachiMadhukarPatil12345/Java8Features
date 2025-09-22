package java8Features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class Worker5
{
	int id;
	String name;
	public Worker5(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Worker5 [id=" + id + ", name=" + name + "]";
	}
}

public class Stream_Map
{

	
	
	public static void main(String[] args)
	{
		Worker5 w1= new Worker5(18, "Prachi");
		Worker5 w2= new Worker5(15, "Prajkta");
		Worker5 w3= new Worker5(22, "Prati");
		Worker5 w4= new Worker5(56, "Siya");
		Worker5 w5= new Worker5(68, "Raam");
		Worker5 w6= new Worker5(44, "Raghav");
		Worker5 w7= new Worker5(98, "raman");

		List<Worker5> mylist = Arrays.asList(w1,w2,w3,w4,w5,w6,w7);
		mylist.stream().map(i ->i).forEach(System.out::print);
		System.out.println( "=============================");
		mylist.stream().map(i ->i.name.toUpperCase() ).forEach(System.out::println);
		System.out.println( "=============================");
		mylist.stream().map(i ->i.id + " = " + i.name + " ").forEach(System.out::print);
		System.out.println( "=============================");
		mylist.stream().filter( w -> w.name.contains("Pra")  ).map(w -> w.name.toLowerCase()) 
				.forEach( (v) ->
						System.out.println(v ));
		System.out.println( "=============================");
					    
				//.forEach(q) -> System.out.println(q)) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<String> asList = Arrays.asList("Prachi","Vrinda","Prutha","Ram");
		
asList.stream().filter( y ->y.endsWith("a")  ).forEach(e -> System.out.println(e));
asList.stream().map(i->i.toUpperCase() +i.length()).forEach( d-> System.out.println(d) );

System.out.println(                  );
System.out.println( "=============================");







List<String> asList2 = Arrays.asList("Prachi","Vrinda","Prutha","Ram","Jayy","Radha","Ram");
asList2.stream().skip(4).forEach(d-> System.out.println(d));




// Returns a stream consisting of the remaining elements of this stream after discarding the first n
// elements of the stream. If this stream contains fewer than n elements then an empty
 // stream will be returned.


 

System.out.println(                  );
asList2.stream().distinct().forEach(d-> System.out.println(d));
System.out.println(                  );
long count = asList2.stream().count();
System.out.println(count);

	}
}
