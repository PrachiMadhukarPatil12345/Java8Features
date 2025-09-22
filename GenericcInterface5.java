package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericcInterface5
{
	interface myinterface<T,R>
	{
		R Add(T t, T s);
	}
	public static void main(String[] args)
	{
		myinterface <String [],String []> myinter= (a,b) ->
		{
			List <String>result=new ArrayList<>();
			for(String s: a )
			{
				if(s.startsWith("A"))
				{
					result.add(s);
					
				}
			}
			for(String s: b )
			{
				if(s.startsWith("A"))
				{
					result.add(s);
					
				}
			}
			return result.toArray(new String[0]);
			//return a;
		};
		String er[];
		er=myinter.Add(new String[]{"Ram","shyam","Smitaa"},new String[]{"Anil","Atul","Annt"});
		System.out.println(Arrays.toString(er));
			
		};
		
	
	}


