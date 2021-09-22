
public class Program7 {
	//count occurence of characters
	
	public static void main(String[] args) {
		
		String someString = "elephanteeee";
		char someChar = 'e';
		int count = 0;
		 
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		
		System.out.println(count);
		
		
		
	}

}
