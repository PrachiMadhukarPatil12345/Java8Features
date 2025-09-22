package java8Features;

import java.util.function.BiPredicate;

public class BiPredicatedemo 
{

	public static void main(String[] args)
	{
		BiPredicate <Integer,Integer> pr= (i,s) ->
		 i==s;
		pr.test(678,35);
		
		// (i-> i%2==0);
		
		
		
		BiPredicate <Integer,Integer> prr= (i,s) ->
		{ //i==s;
		 String s1= Integer.toString(i);
		 String s2= Integer.toString(s);
		 
		 return s1.equals(s2);
		};
		boolean test = prr.test(35,35);
		System.out.println(test);
	}

}
