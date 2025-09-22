package java8Features;

public class MethodReference2
{
	public MethodReference2(int y,String s) // for default contructor
	{
		System.out.println("Hii from Parameter constructor");
	}
	public MethodReference2() // for default contructor
	{
		System.out.println("Hii from constructor");
	}
	
	
	
	void fun()
	{
		System.out.println("Fun Method");
	}
	
	
	
	
	void multiply(int a,int b)
	{
		System.out.println("Multiply =  " + a*b);
	}
	
	static void mydance(String s)
	{
		System.out.println("Static method =" + s);
	}
	
	public static void main(String[] args)
	{
	}

}
