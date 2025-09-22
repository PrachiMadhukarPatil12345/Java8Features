package java8Features;

import java.util.HashSet;
import java.util.function.Function;

public class FunctionDemo
{

	public static void main(String[] args)
	{
		Function<Integer,Integer> f= (i) ->
		{
			return i;
		};
		System.out.println(f.apply(68));
		
		Integer apply = f.apply(78);
		System.out.println(apply);
		
		
		
		
		Function <Integer, String> f1 =(y) ->
		{
			System.out.println("hbnfg"+y);
			//return String.valueOf(y);
			return Integer.toString(y);
			//return "rgdf";
			
		};
		f1.apply(89);
		
		
		
		
		Function <int [], Integer> f2 =(array1) -> 
		{  int sum=0; 
		for(int j:array1) 
		{ 
			System.out.println(sum=sum+j); 
			
		}return sum;
		}; 
		f2.apply(new int[] {6,7,3,98,2,97});
		System.out.println(               );

		
		
		Function <int [], HashSet<Integer>> f3 =(array2) ->
		{
			HashSet<Integer> hs= new HashSet<>();
			for(int i: array2)
			{
				hs.add(i);
			}
			//System.out.println(" hashset"+ "="+ hs);
			return hs;
			
		};
		HashSet<Integer> apply2 = f3.apply(new int[] {6,7,3,98,2,2,98,98,98});
		System.out.println(apply2);
	}

}
