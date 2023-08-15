//Comparator
import java.util.*;
class Employee {

	String empName = null;
	float sal = 0.0f;

	Employee(String empName , float sal) {
	
		this.empName = empName;
		this.sal = sal;
	}
	public String toString() {
	
		return "{"+empName + ":"+ sal+" }";
	}

}
class sortByName implements Comparator<Employee> {

	public int compare(Employee obj1 , Employee obj2) {
	
		return obj1.empName.compareTo(obj2.empName);
	}
}
class sortsal implements Comparator<Employee> {

	public int compare(Employee obj1 , Employee obj2) {
	
		return (int)(obj1.sal - obj2.sal);
	}
}
class ListSortDemo {

	public static void main(String[]args) {
	
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("kanha",200000.00f));
		al.add(new Employee("ashish",700000.00f));
		al.add(new Employee("badhe",500000.00f));
		al.add(new Employee("rahul",120000.00f));
		al.add(new Employee("shashi",2000000.00f));

		System.out.println(al);

		Collections.sort(al,new sortByName());
		System.out.println(al);
		Collections.sort(al,new sortsal());
		System.out.println(al);

	}
}

