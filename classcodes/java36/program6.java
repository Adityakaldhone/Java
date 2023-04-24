class ArgumentDemo{
	void fun(int x){	
		System.out.println(x);
	}
	public static void main(String[]args){
		ArgumentDemo obj = new ArgumentDemo();	
		obj.fun(10);
	}
}
//error: Non static variable cannot be referenced from static context
