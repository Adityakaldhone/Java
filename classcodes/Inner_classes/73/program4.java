//Static Inner class
class Outer {

	static class Inner {
	
		void m1() {
		
			System.out.println("IN M1");
		}
	}
}
class Client {

	public static void main(String[]args) {
	
		Outer.Inner obj = new Outer.Inner();
		obj.m1();
	}
}
