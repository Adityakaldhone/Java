//Default Exception handler

//**Arithmetic Exception**
class Demo {

	void m1() {
	
		System.out.println("In m1");
		System.out.println(10/0);
		m2();
	}
	void m2() {
	
		System.out.println("In m2");
	}

	public static void main(String[]args) {
	
		System.out.println("Start main");
		Demo obj = new Demo();
		obj.m1();
	}

}
/*
output: Start main
In m1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.m1(program1.java:9)
        at Demo.main(program1.java:21)
 */
