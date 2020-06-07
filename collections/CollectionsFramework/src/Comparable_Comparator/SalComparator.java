package Comparable_Comparator;

import java.util.Comparator;

public class SalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSal().compareTo(o2.getSal());
	}

}
