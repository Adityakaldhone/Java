//====abstract classes====//
abstract class Parent {

	void career() {
	
		System.out.println("Doctor");
	}
	abstract void marry();
}
class Client {

	public static void main(String[]args) {
	
		Parent obj = new Parent();  //error
	}
}
/*
output:
program1.java:14: error: Parent is abstract; cannot be instantiated
                Parent obj = new Parent();  //error
                             ^
 */ 
