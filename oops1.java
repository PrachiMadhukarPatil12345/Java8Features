package java8Features;

interface AO
{
	void calculate(int a,int b);
}

class Addition implements AO
{
	// @Override
	public void calculate(int a,int b)
	{
		System.out.println(a+b); 
	}
}

public class oops1
{
	public static void calculate(AO ao)
	{
		ao.calculate(100,50);
	}

	public static void main(String[] args)
	{
		Addition a1=new Addition();
		//calculate(a1);
		
		calculate((int a,int b)-> {

			System.out.println(a+b); 
		});
		
		calculate((int a,int b) ->{

			System.out.println(a-b); 
		});
		
		calculate((a, b) ->System.out.println(a/b)); // lambada
	}

}
