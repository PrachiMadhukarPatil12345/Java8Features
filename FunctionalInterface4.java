package java8Features;

class User
{
	int id;
	String name="";
	public User(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
public class FunctionalInterface4
{
interface Demo
{
	User getUser();
}

	public static void main(String[] args)
	{
		Demo d=()->
		{
			//User user=new User();
			return new User(10,"prachi");
			//return new User(11,"prachi");
		};
		System.out.println(d.getUser());
	}

}
