package Collections_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashmapExample {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		Map<Integer,HashMap<String,List<Integer>>> map = new HashMap<>();
		HashMap<String,List<Integer>> hashmap = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
				
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				list1.add(i);
			}
			else {
				list2.add(i);
			}
		}
		hashmap.put("even", list1);
		hashmap.put("odd", list2);
		map.put(100, hashmap);
	//        for(Map.Entry<Integer,HashMap<String,List<Integer>>> entry: map.entrySet()) {
	//        	System.out.println(entry.getKey());
	//        	System.out.println(entry.getValue());
	//        }
//		for(Map.Entry<String,List<Integer>> entry: hashmap.entrySet()) {
//			if((list1.contains(n) && list1.equals(entry.getValue())) || (list2.contains(n) && list2.equals(entry.getValue()))) {
//				System.out.println(entry.getKey());
//			}
//		}
			
			for(Iterator<Integer> itr = map.keySet().iterator();itr.hasNext();) {
		        Integer map_key = itr.next();
		        HashMap<String,List<Integer>> hashmap1 = map.get(map_key);
		        for(Entry<String, List<Integer>> entry: hashmap1.entrySet()) {
		    		List<Integer> templist = entry.getValue();
		    		if(templist.contains(n)) {
		    			System.out.println("You have entered "+entry.getKey());
		    		}
		        }
		       
			}
	}
}
