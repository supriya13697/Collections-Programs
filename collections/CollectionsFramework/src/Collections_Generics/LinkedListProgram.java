package Collections_Generics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
        l.add("a");
        l.addFirst("b");
        l.addLast("c");
        l.add("d");
        l.add(1,"e");
        l.add(null);
        l.add(null);
        System.out.println(l);
        
        l.removeLast();
        System.out.println(l);
        
        //To reverse list
        Iterator i = l.descendingIterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
        LinkedList l2 = new LinkedList<>();
       
        //Union
        l2.addAll(l);
        System.out.println(l2);
        
        l2.add(200);
        l2.add(300);
        
        //Intersection
//        l2.removeAll(l);
//        System.out.println(l2);
        
        //except list2
        l2.retainAll(l);
        System.out.println(l2);
	}

}
