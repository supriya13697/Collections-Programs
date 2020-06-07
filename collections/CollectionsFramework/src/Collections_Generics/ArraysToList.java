package Collections_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {

		String[] arr = new String[3];
		arr[0] = "supriya";
		arr[1] = "reddy";
		arr[2] = "kovvuri";
		
		List<String> list = new ArrayList<>();
		
//		//Method1
//		list = Arrays.asList(arr);
//		System.out.println("list");
		
//		//Method2
//		Collections.addAll(list, arr);
//		System.out.println(list);
		
		//Method3
		for(String s: arr) {
			list.add(s);
		}
		System.out.println(list);
		
		
		
		
	}
}
