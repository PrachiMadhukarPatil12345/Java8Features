package java8Features;

//T type
//U - type
// R- return type

public class GenericInterface3
{
	
	interface TestDemo<T>
	 {
		 T add(T t, T t1); // return type is integer, parameter is also int
	 }

	public static void main(String[] args)
	{
		TestDemo<Integer> td= (r,u) ->
		{
			
			return r+u;
		};		
		int a=td.add(56,89);
		System.out.println(a);
		
		
		TestDemo<String> tt= (r,u) ->
		{
			
			return r+u;
		};
		System.out.println(tt.add("hggggggg"," ghvgvgffffff"));
		
	}

}
