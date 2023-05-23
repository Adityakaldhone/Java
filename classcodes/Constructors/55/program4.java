class Demo{

	int x = 10;
	static int y = 20;

	Demo(){
	
		System.out.println("In constructor");
	}
	static {
	
		System.out.println("In static block 1");
	}
	{
	
		System.out.println("In instance block 1");
	}

	public static void main(String[]args){
	
		System.out.println("main");
		Demo obj = new Demo();
	}
	static {
	
		System.out.println("In static block 1");
	}
	{
	
		System.out.println("In instance block 1");
	}

}
