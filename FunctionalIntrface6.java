package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class User1
{
	int id;
	String Uname;
	@Override
	public String toString() {
		return "User [id=" + id + ", Uname=" + Uname + "]";
	}
	public User1(int id, String uname) {
		super();
		this.id = id;
		Uname = uname;
	}
}
public class FunctionalIntrface6 
{

	@FunctionalInterface
	interface myinterface
	{
		List<User1> getUser(); // return type of getUser is List<User1>
	}


	public static void main(String[] args)
	{  
		List l1= new ArrayList();
		User1 u =new User1(2, null);
		l1.add(u);

		l1.add(new User1(6,"AbcXyz"));
		myinterface mr= ()->
		{
			return l1;
		};
		List <User1> ui =mr.getUser();
		for(User1 uuu:ui)
		{
			System.out.println(uuu.id);
			System.out.println(uuu.Uname);
			System.out.println("================================");
		}

		//	ListIterator<User1> i=	l1.listIterator();
		//	while(i.hasNext())
		//	{
		//		System.out.println(i.next()); // Returns the next element in the iteration
		//		System.out.println(i);

	}
}


