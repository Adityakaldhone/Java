class Parent {

	int x = 10;

	Parent(){
	
		System.out.println("In Parent Constructor");
	}

	void Access(){
	
		System.out.println("In Parent Instance method");	
	}
}
class Child extends Parent {

	int y = 20;

	Child(){
	
		System.out.println("In child Constructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client {

	public static void main(String[]args) {
	
		Child obj = new Child();
	}
}
/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Inheritance/60# java Client
In Parent Constructor
In child Constructor
10
20
 */
