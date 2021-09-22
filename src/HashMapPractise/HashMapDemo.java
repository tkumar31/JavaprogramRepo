package HashMapPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
	
	//Iterate hash map
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("India", "New Delhi");
		hashMap.put("USA", "Washinton DC");
		hashMap.put("UK", "London");
		hashMap.put("France", "Paris");
		hashMap.put("Germany", "Berlin");
		
		// Using iterator over the keys: using keySet()
		Iterator<String> it = hashMap.keySet().iterator();
				
		while(it.hasNext())
		{
				String key = it.next();
				String value = hashMap.get(key);
				System.out.println(" Key: "+ key+ " Value: "+value);
		}
		
   System.out.println("-----------------------------");

       // Iterator using the set (pair): using entrySet
		  
		
		Iterator<Entry<String, String>> it1 = hashMap.entrySet().iterator();
		
		  while(it1.hasNext())
		  {
			  Entry<String, String> entry = it1.next();
			  System.out.println("Key = "+ entry.getKey() + " And Value = " + entry.getValue());
		  }

		   System.out.println("-----------------------------");
		   
		   
		   //iterate hashmap using java 8 for each and lamda
		   
		   hashMap.forEach((k,v) -> System.out.println(" Key = "+ k + " And Value = " + v ));
		   

	}

}
