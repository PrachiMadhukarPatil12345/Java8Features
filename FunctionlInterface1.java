package java8Features;

public class FunctionlInterface1
{
	@FunctionalInterface
	interface A1
	{
		void Addition();
		
	}
	
	public static void  main(String[] args) 
	{
		A1 a= ()-> System.out.println("Default");
		a.Addition();
	}
	
	
	
	/*
	 * public static void main(String[] args) {
	 * Add(()->System.out.println("mymethod")); }
	 */
	
}
