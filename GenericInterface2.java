package java8Features;
import java.util.Arrays;
import java8Features.GenericInterface.TestDemo;

// T type
// U - type
 // R- return type

class User5
{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User5 [id=" + id + ", name=" + name + "]";
	}
	String name;
}







public class GenericInterface2
{
	interface TestDemo<T ,U >
	 {
		 void add(T t,U u);
		 // void add(int[]t,String []u);
		 // void add(User u, Integer i
		 // int add(int a, int b)
	 }
	 
		 
	 
	public static void main(String[] args)
	{
		
		TestDemo<String,Integer> test=(i,j) ->
		{
			System.out.println(i+ "" + j);
		};	
		test.add("wqesfggfc",854);
		
		
		
		
		TestDemo<String[],int[]> test2=(i,j) ->
		{
			System.out.println(Arrays.toString(i)+ "" +Arrays.toString(j));
		};
		test2.add(new String []{"cvb","nmjkk","sdfgghhh"},new int []{9,8,778,6});
		
		
		
		
		User5 user5 =new User5();
		user5.setId(55);
		user5.setName("ggggg");
		
		TestDemo td= (h,k) ->
		{
			System.out.println(user5.getId());
			System.out.println(user5.getName());
		};
		td.add(user5, 56);
	}

}
