class Demo{

	int x = 10;
	private int y = 20;

	void fun(){
	
		System.out.println(x);
		System.out.println(y);

	
	}
}
class MainDemo{

	public static void main(String[]args){
	
		Demo obj = new Demo();
		obj.fun();

		System.out.println(obj.x);
		System.out.println(obj.y);//error:int y has privte access in class Demo
		
		System.out.println(x);  //error: cannot find Symbol
		System.out.println(y);  //error:cannot find Symbol
	}
}
