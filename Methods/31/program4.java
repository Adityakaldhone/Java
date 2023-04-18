class Demo2{

	void fun(float x){
	
		System.out.println("IN fun");
		System.out.println(x);
	}
	public static void main(String[]args){
	
		Demo2 obj = new Demo2();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
	}
}
