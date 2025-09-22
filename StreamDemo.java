package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		// method 1 
		Stream<Integer> stream1=Stream.of(2,6,6,8);
		stream1.forEach((y) -> System.out.println(y));

		Stream<String> stream2=Stream.of("oiu","tghhj","wexdfg ","wezdfcvbnm");
		stream2.forEach((x) -> System.out.println(x));
		
		// method 2 to create Stream
		ArrayList<String> s1= new ArrayList<>();
		s1.add("jhhj");
		s1.add("jhhj");
		s1.add("jhhj");
		Stream<String> mystream =s1.stream();
		mystream.forEach((x) -> System.out.println(x));
		//Stream<Integer>i= Stream.of(2,6,6,8).filter(i%2==0);
		
		
		
		
		
		
		
		String[] names= {"Prachi", "Aadi","Smita","Vrinda"};
		List<String> asList = Arrays.asList(names);
		Stream<String> stream = asList.stream();
		//stream.forEach( (o -> System.out.println(o)  ));
		stream.forEach(  ( o ) ->
		
			System.out.println(o)   );
		
		
		
		
		
		
		
		
	}

}
