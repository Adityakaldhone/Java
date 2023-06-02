//----------static in parent class------------//


class Parent {

	static {
	
		System.out.println("In Parent static block");
	}
}

class Child extends Parent {

	static {
	
		System.out.println("In child static block");
	}
}

class Client {

	public static void main(String[]args){
	
		Child obj = new Child();
	}
}


/*
output:
In Parent static block
In child static block
 */
