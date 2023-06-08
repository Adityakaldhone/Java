class Parent {

	private void fun() {
	
		System.out.println("Parent fun");
	}
}
class Child extends Parent {

	void fun() {
	
		System.out.println("Child fun");
	}
}
/*
 It is not an overriding concept beacause private cannot 
 visible in another class

 */
