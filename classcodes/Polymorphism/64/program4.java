// static modifier in overriding//
class Parent {

	static void fun() {
	
		System.out.println("In Parent fun");
	}
}
class Child extends Parent {

	void fun() {
	
		System.out.println("In child fun");
	}
}
/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Polymorphism/64# javac program4.java
program4.java:11: error: fun() in Child cannot override fun() in Parent
        void fun() {
             ^
  overridden method is static
1 error
 */ 
