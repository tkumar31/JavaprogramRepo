import java.util.ArrayList;

public class Program4 {
	
	//compare same indexs of 2 diff arrays and create a new array for a match values
	
	public static void main(String[] args) {
		
		int a [] = {2,4,6,8,9,10};
		int b [] = {6,7,8,4,9,10};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
				
			}
		}
		Object[] thirdArray = al.toArray();
		
		for(Object o:thirdArray)
		{
			System.out.println(o);
		}
	}

}
