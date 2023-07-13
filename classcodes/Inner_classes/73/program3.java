//error in this code
class Outer {

	Object m1() {
	
		class Inner {
		
			void m1() {
			
				System.out.println(" In m1 Inner ");

			}
		}
		return new Inner(); 
	}
}
class client {

	public static void main(String[]args) {
	
		Outer obj = new Outer();
		obj.m1().m1();
	}
}
/*
 program3.java:22: error: cannot find symbol
                obj.m1().m1();
                        ^
  symbol:   method m1()
  location: class Object
1 error
 */
