package java8Features;

public class FinctionalInterface
{
	
	public static void main(String[] args)
	{
//		Test t= (a,b)->
//		System.out.println("Additon by passing int as agument" + ":"+ a+b);
		//t.Add(20,45);
		
		/*
		 * int nums1[]= {1,2,3,4}; 
		 * Test t= (nums)-> { int sum=0; for(int i:nums1){
		 * sum+=i; //System.out.println(i); } return sum; };
		 * int val=t.Add(nums1);
		 * System.out.println(val);
		 */
		
		int nums[]= {1,2,3,4,5};
		Test t=(i)->
		{
			for(int j:nums)
			{
				System.out.println(j);
			}
		};
		t.doSum(nums);

	}
}
