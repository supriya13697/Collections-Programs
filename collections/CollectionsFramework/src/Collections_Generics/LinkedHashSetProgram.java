package Collections_Generics;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new LinkedHashSet();
		s.add(10);
		s.add(null);
		s.add(20);
		s.add(10);
		System.out.println(s);
		
		Set s1 = new LinkedHashSet(s);
		s1.add("abc");
		s1.add("The");
		System.out.println(s1);
	}
}
