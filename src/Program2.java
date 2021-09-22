
public class Program2 {

	//print multiplication table without using multiply operator
	
	public static void main(String[] args) {
		
		int a = multiply(6,10);
        System.out.println(a);		
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int sum =0;
		 int k=1;
		while(k<=j)
		{
			sum = sum +i;
			k++;
		}
		
		return sum;
		
	}
}
