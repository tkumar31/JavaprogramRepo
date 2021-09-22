
public class Program1 {
	
	// Create a method which accepts an array and return the sum of it
	
	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,3};
		
		System.out.println(arraySum(a));
	}

	

	public  static int arraySum(int [] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			
			sum = sum+a[i];
		}
		return sum;
		
	}

}
