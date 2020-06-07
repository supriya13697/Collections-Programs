package Comparable_Comparator;

public class Employee {
    Integer empId;
    String empName;
    Double sal;
	public Employee(Integer empId, String empName, Double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}
    
	
	
}
