
public class Program5 {
	
	//sorting an array in ascending oorder
	
	public static void main(String[] args) {
		
		int a [] = {2,6,4,1,5,3};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}

		for(int i=0;i<a.length;i++)
		{
			
		 System.out.println(a[i]);
		}
	}
	
}
