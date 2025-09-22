package java8Features;

import java.util.Arrays;

public class GenericInterface
{
	// T : Type
	// U: Type
	
	
	interface TestDemo<T>
	{
		void Add(T t, T t1); // internally becam as void Add(Integer t, Integer t1)
		
		//void Add(String t, Integer i);
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		 TestDemo<Integer> d= (i,j) -> // i,j is of type integer
		{
			System.out.println(i+j); //internally becam as void Add(integer t,integer t1)
		};
		d.Add(23, 78);
		
		
		
		
		
		TestDemo<String> d1= (i,j) ->
		{
			System.out.println(i+j); //internally becam as void Add(string t, String t1)
		};
		d1.Add("Prachi", "Patil");
		
		
		
		
		TestDemo<Double> d2= (i,j) ->
		{
			System.out.println(i+j);
		};
		d2.Add(67.798, 34.23);
		
		
		
		
		TestDemo <int []> t= (i,j) -> // will become int[]u,int[]i 
		{
			System.out.println( Arrays.toString(i)+Arrays.toString(j));
			for(int val1:i)
			{
				System.out.println(val1);
			}
			
			
			for(int val2:j)
			{
				System.out.println(val2);
			}
		};
		t.Add(new int[] {2,3,4},new int[] {5,6,7});
		
		
		
		
	}

}
