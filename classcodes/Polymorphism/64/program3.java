//===final modifier in overriding===//
//we cannot override constant method //
class Parent {

	final void fun() {
	
		System.out.println("Parent fun");
	}
}

class Child extends Parent {

	void fun() {
	
		System.out.println("IN child");
	}
}
/*
output:
program3.java:13: error: fun() in Child cannot override fun() in Parent
        void fun() {
             ^
  overridden method is final
1 error
 */
