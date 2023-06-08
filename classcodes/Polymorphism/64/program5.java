//here is also not overriding beacause these static methods are individual to their individual classes//
class Parent {

	static void fun() {
	
		System.out.println("In Parent Fun");
	}
}
class Child extends Parent {

	static void fun() {
	
		System.out.println("In Child Fun");
	}

}

class Client {

	public static void main(String[]args){
	
		Parent obj = new Parent();
		Parent.fun();
		
		Child obj2 = new Child();
		Child.fun();

		Parent obj3 = new Child();
		Parent.fun();
	}
}

/*
output:
In Parent Fun
In Child Fun
In Parent Fun
 */
