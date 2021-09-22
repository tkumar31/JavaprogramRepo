
public class ReverseArray {
	
	public static void main(String[] args) {
		
		int c [] = new int[5];
		 int[] revArray = reverseAnArray(5,c);
		
		System.out.println("Reserve array "+revArray);
		
	}
    
	
	public static  int[] reverseAnArray(int b,int [] c)
	{
		int c1 [] = new int [b];
		
		for(int i =c1.length-1;i>=c1.length-1;i--)
		{
			
		  c1[i]=c[i];
			
		}
		
		return c1;
	}
}
