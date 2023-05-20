class Demo{

	int x = 10;
	static int y = 20;
	
	void fun1(){
	
		System.out.println(x);
		System.out.println(y);
	}

	static void fun2(){	

		System.out.println(y);
	}
}
class Client{

	public static void main(String[]args){
	
		Demo obj1 = new Demo();

		obj1.fun1();
		obj1.fun2();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
	}
}
