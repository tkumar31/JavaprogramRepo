package HashMapPractise;

import java.util.HashMap;

public class CountOccurenceOfEachCharacter {
	
	public static void main(String[] args) {
		
		charOccurenceCount("Tarun");
		
	}

	
	public static  void charOccurenceCount(String str)
	{
		HashMap<Character, Integer> charMap = new HashMap<Character,Integer>();
		char [] charArray = str.toCharArray();
		for(char c:charArray)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c,charMap.get(c)+1 );
			}
			
			else
			{	
				charMap.put(c, 1);	
			}
		}
		
		System.out.println(str+ ":" +charMap);
	}
}
