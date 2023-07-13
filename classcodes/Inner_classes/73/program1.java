//Method local Inner class
class Outer {

	void m1() {
	
		System.out.println("In outer m1");


		class Inner {
		
			void Innerm1() {
			
				System.out.println("In Inner m1");
			}
		}
		Inner obj = new Inner();
		obj.Innerm1();
	}

	void m2() {
	
		System.out.println("in outer m2");
	}
}
class client {

	public static void main(String[]args) {
	
		Outer obj = new Outer();
		obj.m1();
		obj.m2();		
	}
}
