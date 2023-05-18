class Employee{

	int empId = 10;
	String name = "Kanha";

	static int y = 50;

	void EmpInfo(){
	
		System.out.println("Employee Id = "+ empId);
		System.out.println("name = "+name);
		System.out.println("y = "+y);

	
	}
}
class MainDemo{

	public static void main(String[]args){
	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.EmpInfo();
		emp2.EmpInfo();

		emp2.empId = 20;
		emp2.name = "Rahul";
		emp2.y = 2000;
		
		System.out.println("--------------------------");
		
		emp1.EmpInfo();
		emp2.EmpInfo();
	}
}
