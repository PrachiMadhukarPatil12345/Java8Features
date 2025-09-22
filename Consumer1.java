package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1
{

	public static void main(String[] args)
	{
//		Consumer<Integer> cm=(a)
//				-> System.out.println(a);
//				cm.accept(80);
		
		
//				Consumer<String> cmm=(a) ->
//				System.out.println("hello " + " " +a.toUpperCase());
//						cmm.accept("prachi");
//						cmm.accept("patil");
		
		
		
//		Consumer<int []>  cmmm  = (y) 
//				->{
//					int max=0;
//					for(int i:y)
//					{
//						if(i>max)
//						{
//							max=i;
//						}
//					}
//					//System.out.println(Arrays.toString(y));
//					System.out.println(max);
//				};
//		cmmm.accept(new int[]{5,7,8,9});
		
		
		
		
		Consumer <ArrayList<Integer>> cmr =(al)
				->
		
		{
			al.forEach((x)->  // consumer will accept Each value given by al , Store in x
			                     // & print x
			                      
			//ya vr cursoror neun bg ch
			
			
			System.out.println(x));
			
//			for(Integer val:al)
//			{
//				System.out.println(val);
//			}
		};
		
		ArrayList<Integer> ar= new ArrayList<>();
		ar.add(78);
		ar.add(788);
		ar.add(780);
		ar.add(786);
		ar.add(754);
		ar.add(218);
		
		
		cmr.accept(ar);
	}
}
