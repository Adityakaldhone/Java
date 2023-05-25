class Demo{

	int x = 10;

	Demo(){
	
		System.out.println("In no argument constructor");
	}
	Demo(int x){
	
		System.out.println("In parameterized constructor");
	}
	Demo(Demo xyz){
	
		System.out.println("In Demo");
	}

	public static void main(String[]args){
	
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
		Demo obj3 = new Demo(obj1);
	}
}
