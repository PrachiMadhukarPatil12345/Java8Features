package java8Features;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class User6
{
	int id;
	String name;
	
	public User6(int i, String string)
	{
		id=i;
		name=string;
	}
	// @Override
	@Override
	public String toString() {
		return "User6 [id=" + id + ", name=" + name + "]";
	}
	
}



interface Supplier<T>
{
	T get();
}


public class Supplierdemo
{

	public static void main(String[] args)
	{
		
		
		Supplier<Integer> sup = () -> 
		{
			return 10;
		};
		System.out.println(sup.get()); 
		
		
		
		
		Supplier<String> s = () -> "prachi";
		System.out.println(s.get());
		
		
		
		Supplier<String[]>  s1 = () ->
		{
			return new String[] {"mnb","bhuu","dgfc","gfcbthgc"};
			
		};
		System.out.println(Arrays.toString( s1.get()));
		for(String ss:s1.get())
		{
			System.out.println(ss);
		}
		
		
		
		
		Supplier<String>otp= () ->
		{
			System.out.println(            );
			
			String otp1= " ";
			otp1=otp1 +(int)( Math.random()*100_000_00);
			
			return otp1;
	     };
	System.out.println(otp.get());
	
	
	
	
	
	
	
	Supplier <List<User6> > user=() -> // takes data of type User6,
	                                    // doesn't take any parameter
	
	{
		List <User6> u= Arrays.asList(   new User6(2,"lkj"),new User6(8,"ygh")  );
		return u;
		
	};
	List<User6> u =user.get();
	
	u.forEach((x) ->
	
		System.out.println(x));
	}
}

