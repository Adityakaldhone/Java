class Parent {
	int x = 10;
	static int y = 20;

	static {
	
		System.out.println("In Parent static block");
	}
	
	Parent(){
	
		System.out.println("In Parent constructor");

	}
	 void MethodOne(){
	
		System.out.println(x);
		System.out.println(y);
	}

	static void MethodTwo(){
	
		System.out.println(y);
	}
}

class Child extends Parent{

	static {
	
		System.out.println("In child static block");
	}
	Child(){
		
		System.out.println("In child constructor");
	}
}

class Client {

	public static void main(String[]args){
	
		Child obj = new Child();

		obj.MethodOne();
		obj.MethodTwo();
	}
}


/*
output:
In Parent static block
In child static block
In Parent constructor
In child constructor
10
20
20
 */
