package java8Features;

public class FunctionalProgrammingDemo
{
	interface my1
	{
		void Addition();
	}
	
	public static void calculate(my1 as) // int a
	{
		as.Addition();
	}
	
	
	public static void  main(String[] args)
	{
		System.out.println();
		calculate((()->System.out.println("mymethod")));
	}

}
