package java8Features;
// @FunctionalInterface

interface Test9
{  
	void Show(int q,String w);
	// void Show(); // for default contrucor
	// void Show(); // for default contrucor
	//void Add();
	// void multiply1(int c, int d);
	
//	static void dance(String s1)
//	{
//		System.out.println("Static Method Call");
//	}
}



public class MethodReference
{

	public static void main(String[] args)
	{
		MethodReference2 mr= new MethodReference2();
		Test9 t=MethodReference2::new;
		t.Show(0, null);
		
		//Test9 t9= mr::mydance;
		// Test9.dance("Prachi");
		
		
		

//		Test9 t9=mr:: multiply; // its Advance thing.. no param it takes
//		t9.multiply1(5,9);   // internaly this value is given to multiply
//		
		
		
		
		
		//Test9 t9= new MethodReference2()::fun; way2 // both ways r fine
		//Test9 t9=mr::fun; // way 1
		
		
//		Test9 t9= () ->
//		System.out.println("HK");
		//t9.Add();
	}

}
