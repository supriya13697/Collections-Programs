package Collections_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//can accept one null for key
//can accept multiple null for values
//wont accept duplicates in key
//will accept duplicates in value
//random order

public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm = new HashMap<>();
		hm.put("supriya", "7702725233");
		hm.put("ramu", "9849130686");
		hm.put("kamala", "9963249188");
		hm.put("brunda","9963249188");
		hm.put(null, null);
		hm.put("bhavani",null);
		hm.put("chinnu","9000156662");
		System.out.println(hm);
		
		System.out.println(hm.get("supriya"));
		
		System.out.println(hm.containsKey("bhavani"));
		System.out.println(hm.containsKey("suppi"));
		
		System.out.println(hm.remove("chinnu"));
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		//Using KeySet(for each)
		for(String i:hm.keySet()) {
			System.out.println(i+" "+ hm.get(i));
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		//Using KeySet(Iterator)
		Iterator it = ((Set<String>) hm).iterator();
		while(it.hasNext()) {
			Object key1 =  it.next();
			String value = hm.get(key1);
			System.out.println("Key:" +key1);
			System.out.println("Value:"+value);
			
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,app,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		//Using EntrySet(for each)
		for(Map.Entry<String,String> j: hm.entrySet()) {
			System.out.println(j.getKey());
			System.out.println(j.getValue());
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
	
		
	}

}
