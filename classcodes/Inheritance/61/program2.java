class Parent {

	int x = 10;
	static int y = 20;

	Parent() {
	
		System.out.println("Parent constructor");
	}
}
class Child extends Parent {

	int x = 100;
	static int y = 200;
        Child() {
	
		System.out.println("Child constructor");
	}

	void Access() {
	
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(x);
		System.out.println(y);
	}
}
class Client {

	public static void main(String [] args) {
	
		Child  obj = new Child();

		obj.Access();
	}
}




/*
output:
Parent constructor
Child constructor
10
20
100
200
 */ 
