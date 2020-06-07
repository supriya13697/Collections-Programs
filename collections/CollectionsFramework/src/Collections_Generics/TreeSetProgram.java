package Collections_Generics;

import java.util.TreeSet;
import java.util.Set;
import java.util.SortedSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s = new TreeSet();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(2);
		s.add(200);
		System.out.println(s);
		
		System.out.println(s.subSet(1,10));
		System.out.println(s.headSet(100));
		System.out.println(s.tailSet(20));
		System.out.println(s.first());
		System.out.println(s.last());
		
		
	}

}
