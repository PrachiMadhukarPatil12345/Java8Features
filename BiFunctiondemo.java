package java8Features;
import java.util.function.BiFunction;
public class BiFunctiondemo

//public interface  BiFunction <T,U,R>
//{
//	
//}

{

	public static void main(String[] args)
	{
		 BiFunction <Integer,Integer,Integer> bfc= (p,q) ->
		 {
			return p+q;
			 
		 };
		 Integer apply = bfc.apply(11, 40);
		 System.out.println(apply);
	}

}
