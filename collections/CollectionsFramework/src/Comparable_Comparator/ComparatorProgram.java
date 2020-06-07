package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee(1205,"supriya",3.5));
		a.add(new Employee(1203,"priya",7.6));
		a.add(new Employee(1201,"supriyareddy",4.5));
		a.add(new Employee(1202,"kovvurisupriya",2.2));
		a.add(new Employee(1204,"hello",10.6));
		System.out.println(a);
		
		for(Employee s1: a){
			System.out.println(s1);
		}
		
		
		System.out.println("-----------------------------------------------------------");
		
		Collections.sort(a, new NameComparator());
		
		for(Employee s1: a){
			System.out.println(s1);
		}
		
		
		System.out.println("-----------------------------------------------------------");
	
		Collections.sort(a, new SalComparator());
		
		for(Employee s1: a){
			System.out.println(s1);
		}
		
		
		System.out.println("-----------------------------------------------------------");
	}

}
