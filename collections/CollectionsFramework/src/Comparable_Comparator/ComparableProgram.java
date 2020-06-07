package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableProgram {
	
	public static void main(String args[]) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1205,"supriya",90));
		al.add(new Student(1203,"priya",70));
		al.add(new Student(1201,"supriyareddy",75));
		al.add(new Student(1202,"kovvurisupriya",82));
		al.add(new Student(1204,"hello",60));
		System.out.println(al);
		
		for(Student s: al){
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------------");
		
		Collections.sort(al); 
		
		for(Student s: al){
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------------------------------");

		
	}
}
