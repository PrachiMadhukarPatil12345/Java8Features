package java8Features;

import java8Features.GenericInterface3.TestDemo;

public class GenericInterface4
{
	
	
//	interface TestDemo<T,U,R>
//	 {
//		 R add(T t, U t1); // return type is integer, parameter is also int
//	 }
//	
	
	
	interface TestDemo<T,R>
	 {
		 //R add(T t,U u); // return type is integer, parameter is also int

		R add(T d, T t ); // return type is different , pameter is same
	 }

	
	
	public static void main(String[] args)
	{ 
		TestDemo <Double,Integer>dd= (d,u) ->// return type is different , pameter is same
		{
	       return 10;
	    };
	int y=dd.add(6.4,2.4);
	System.out.println(y);
	}
	
	
	
	
	
//		TestDemo<Integer, String,Integer> td= (r,u) -> // third is return type
//		                                           // 1st two are prameters
//		{
//			
//			return r;
//		};		
//		int a=td.add(56,"89");

	

}
