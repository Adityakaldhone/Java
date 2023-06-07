class Demo {

	void fun(int x,float y) {
	
		System.out.println("In int-float fun");
	}
	void fun(float x,int y) {
	
		System.out.println("In float-int  fun");
	}
}
class Client {

	public static void main(String[]args) {
	
		Demo obj = new Demo();
		obj.fun();
	}
}

/*
output:
program3.java:17: error: no suitable method found for fun(no arguments)
                obj.fun();
                   ^
    method Demo.fun(int,float) is not applicable
      (actual and formal argument lists differ in length)
    method Demo.fun(float,int) is not applicable
      (actual and formal argument lists differ in length)
1 error
 */ 
