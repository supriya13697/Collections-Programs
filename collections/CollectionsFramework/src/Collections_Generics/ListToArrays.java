package Collections_Generics;

import java.util.ArrayList;
import java.util.List;

public class ListToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("supriya");
		list.add("reddy");
		list.add("kovvuri");
		
		//same type
		String[] array = new String[list.size()];
		list.toArray(array);
		
		for(String s: array) {
			System.out.println(s);
		}
		

	}

}
