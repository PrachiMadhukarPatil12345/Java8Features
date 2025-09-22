package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_FlatMap
{

	public static void main(String[] args)
	{
		List<String>FrontEnd = Arrays.asList("coreJva", "AdvancedJava","SpringBoot");
		List<String> BackEnd = Arrays.asList("HTML", "CSS","JavaScript","React");
		List <List<String>  > courses = Arrays.asList(FrontEnd,BackEnd);
		
		courses.forEach(i ->System.out.println(i)  );
		System.out.println( "=============================");
		// courses.forEach(i ->System.out.println(i.size())  );
		// courses.forEach(i ->System.out.println("hvgh") );
		
		Stream<String> flatMap = courses.stream().flatMap(m -> m.stream() );
		flatMap.forEach(r -> System.out.println (r) );
		// flatMap.map(o -> o.length() ) . forEach(y -> System.out.println(y ) ) ;
		
		
	}

}
