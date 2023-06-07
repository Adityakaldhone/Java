class Parent {

	Object fun() {
	
		System.out.println("Parent fun");
		return new Object();
	}
}
class Child extends Parent {

	String fun() {
	
		System.out.println("Child fun");
		return "Aditya";
	}
}
class Client {

	public static void main(String[]args){
	
		Child obj = new Child();

		obj.fun();
	}
}

/*
output:
Child fun
 */ 
