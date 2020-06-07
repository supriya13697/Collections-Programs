package Collections_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student{
	int age;
	String name;
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}

//print elements in the list the way we added in list
//positional access : add,
//					  addall
//					  set
//				      get
//					  remove
//Search access : IndexOf
//				  LastIndexOf
//Iterator

public class ArrayListProgram {

	public static void main(String[] args) {
		
		//Can only store string objects
		ArrayList<String> list = new ArrayList<String>();
		list.add("Supriya");
		list.add("Reddy");
		list.add("Kovvuri");
		list.add("Supriya");
		list.add("Priya");                                              
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println("-------------------------------------------------------");
		
		
		Student s = new Student();
		
		//Can store any type of objects
		ArrayList list1 = new ArrayList();
		list1.add("Hi");
		list1.add(2);
		list1.add(9.6);
		list1.add('A');
		list1.add(s);
		list1.add(null);
		System.out.println(list1);
		
		System.out.println("--------------------------------------------------");
	
		list1.addAll(2, list);
		System.out.println(list1);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(list1.size());
		
		System.out.println("------------------------------------------------------");
		
		
		//To get the specific elements from the list 
		String name = list.get(1);
		System.out.println(name);
		
		Object o = list1.get(1);
		System.out.println(o);
		
		System.out.println("--------------------------------------------------");
		
		//To update elements in the list
		list.set(2, "kov");
		System.out.println(list);
		
		System.out.println("--------------------------------------------------");
		
		//To remove elements from the list
		list.remove(2);
		System.out.println(list);
		//To remove all elements in the list
//		list.clear();
//		System.out.println(list);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println(list.indexOf("Supriya"));
		System.out.println(list.lastIndexOf("Supriya"));
		System.out.println(list.indexOf("Hello"));
		
		System.out.println("--------------------------------------------------");
		
		//Iterate in ArrayList
		
		System.out.println("Normal for loop");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Enhanced for loop");
		for(String a : list) {
			System.out.println(a);
		}
		
		for(Object m : list1) {
			System.out.println(m);
		}
		
		System.out.println("Iterating with iterator");
		Iterator i = list.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("--------------------------------------------------");
		
		
	}
	
	

}
