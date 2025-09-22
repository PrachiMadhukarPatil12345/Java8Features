package java8Features;

import java.util.Arrays;

public class FunctionalInterface3
{
	@FunctionalInterface
	interface Test
	{
		int [] getArray();
	}
	
	public static void main(String[] args)
	{
		int arr[]= {2,4,6,8};
		Test t=()->
		{
			return new int[] {2,3,4,5};
			
		};
		
		//int [] myarr=t.getArray();   // also fine
		System.out.println(Arrays.toString(t.getArray()));
	}

}
