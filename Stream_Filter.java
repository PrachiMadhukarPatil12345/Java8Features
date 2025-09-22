package java8Features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


class Worker
{
	int id;
	String name;
	public Worker(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Worker [id=" + id + ", name=" + name + "]";
	}
}

public class Stream_Filter
{

	public static void main(String[] args)
	{
		Worker w1= new Worker(18, "Prachi");
		Worker w2= new Worker(15, "Raj");
		Worker w3= new Worker(22, "Priti");
		Worker w4= new Worker(56, "Siya");
		Worker w5= new Worker(68, "Raam");
		Worker w6= new Worker(44, "Raghav");
		Worker w7= new Worker(98, "raman");

		List<Worker> mylist = Arrays.asList(w1,w2,w3,w4,w5);
		Stream<Worker> mystream = mylist.stream();

		// mystream.filter(l -> l.id>=18 || l.name.startsWith("P")).forEach( System.out::println );
		System.out.println( "=============================");
		mystream.filter(l -> l.name.endsWith("i")  ).filter(l -> l.id>=22).forEach(System.out::println );
		System.out.println( "=============================");








		String[] names= {"Prachi", "Aadi","Smita","Vrinda","aadi","raghav","raman","Rakshit"};
		List<String> asList5	 =Arrays.asList(names);
		asList5.stream().filter(g -> g.startsWith("A")  ).forEach(System.out::println);
// Here g reresents each element in the list.
		
		
		asList5.stream().filter( t -> 
		t.toLowerCase().startsWith("r")  )
		.forEach(System.out::println);




		//		List<Integer> asList = Arrays.asList(2,6,8,9,2,2,0); // It is List
		//		Stream<Integer> stream = asList.stream();  // stream 1
		//		// asList.stream().filter(q -> q% 2==0).forEach(i->System.out.println(i));
		//		asList.stream().filter(q -> q% 2==0).forEach(System.out::println);
		//		// Stream<Integer> filter = stream.filter(i-> i%2==0);
		//		
		//		System.out.println( "=============================");
		//		
		//		Stream<Integer> filter = stream.filter(i-> 
		//		
		//		{
		//		 return	i%2==0 ; });
		//		
		//		filter.forEach((v) ->
		//		System.out.println(v));
		//	    }
	}
}


//after filteration ,it will
// hold only even numbers.

// filter is applied to each element to determine if it should be included
//Returns:
//the new stream


