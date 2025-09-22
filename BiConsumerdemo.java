package java8Features;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//    BiConsumer<T,U>


public class BiConsumerdemo
{

	public static void main(String[] args)
	{
		BiConsumer<Integer,String> c1= (i,b)-> {System.out.println(i+b); };
		
		c1.accept(89,"tfgv");
		
		
BiConsumer<Integer,String> c2= (i,b)-> {System.out.println(i+b); };
		c1.accept(75,"wexfthgch");
		
	}

}
