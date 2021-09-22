import java.util.ArrayList;

public class ArraySum {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> numList = new ArrayList<Integer>();
	numList.add(1);
	numList.add(2);
	numList.add(3);
	numList.add(4);


     System.out.println("Sum of the array list interger = "+arraySum(numList));		
	}
   
	
	public static int arraySum(ArrayList<Integer> al)
	
	{
		int sum =0;
		for (int i : al)
		{  
			sum = sum + i;
		}
		 
	return sum;	
	}
}
