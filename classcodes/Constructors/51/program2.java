class Employee{

	int empId = 10;
	String name = "Kanha";

	void EmpInfo(){
	
		System.out.println("Employee Id = "+ empId);
		System.out.println("name = "+name);

	
	}
}
class MainDemo{

	public static void main(String[]args){
	
		Employee emp1 = new Employee();
		emp1.EmpInfo();

		System.out.println(emp1.empId);
		System.out.println(emp1.name);
		
		System.out.println(emp1.empId);  
		System.out.println(emp1.name);

	}
}
