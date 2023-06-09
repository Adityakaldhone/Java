abstract class Parent {

	void career() {
	
		System.out.println("Doctor");
	}

	abstract void marry();
}

class Child extends Parent {

	void marry() {
	
		System.out.println("Kriti sanon");
	}
}
class Client {

	public static void main(String[]args) {
	
		Parent obj = new Child();
		obj.career();
		obj.marry();
	}
}
