
//===Access specifier in overriding====//
class Parent {

	public void fun() {
	
		System.out.println("Parent fun");
	}
}
class Child extends Parent {

	void fun() {
	
		System.out.println("Child fun");
	}
}

/*
output:
program1.java:10: error: fun() in Child cannot override fun() in Parent
        void fun() {
             ^
  attempting to assign weaker access privileges; was public
1 error
 */ 
