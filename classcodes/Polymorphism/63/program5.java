//===Scenario(A)===//
class Demo {

	void fun(String str) {
	
		System.out.println("String");
	}
	void fun(StringBuffer str1) {
	
		System.out.println("StringBuffer");
	}
}
class Client {

	public static void main(String[]args) {
	
		Demo obj = new Demo();
		obj.fun("Core2Web");

		obj.fun(new StringBuffer("Core2Web"));

		obj.fun(null);

	}
}
/*
output:
program5.java:22: error: reference to fun is ambiguous
                obj.fun(null);
                   ^
  both method fun(String) in Demo and method fun(StringBuffer) in Demo match
1 error
 */ 
