package java8Features;

class User3
{
	int id;
	String name;
	public User3(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User3 [id=" + id + ", name=" + name + "]";
	}
}
public class FunctionalIntrface7

{
	interface interfacedemo
	{
		void ShowDetils(User3 u);
	}
	
	public static void main(String[] args)
	{
		User3 u1=new User3(1,"rdha");
		User3 u2=new User3(2,"rdhaa");
		User3 u3=new User3(3,"rdhaaaa");
		interfacedemo it= (User3 u) ->
		{
			
			
			u.id=5;
			u.name="Prachi";
			
			System.out.println("DETAILS");
			System.out.println("=====================");
			System.out.println(u.id );
			System.out.println(u.name);
		};
		
		it.ShowDetils(new User3(0,"fgvh"));
		System.out.println(u1); // toString method
		System.out.println(u2);
		System.out.println(u3);
	}

}
