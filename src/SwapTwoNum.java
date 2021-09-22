
public class SwapTwoNum {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b= 20;
		
		System.out.println("Before swapping: "+a+" "+b);
		
		//method 1-- with the temp variable
		/*
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		*/
		
		//method 2- without using the third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		
		System.out.println("After swapping: "+a+" "+b);

		
		
		
	}
}
