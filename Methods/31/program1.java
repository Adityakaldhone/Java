class Demo{

	void fun(int x){
		
		System.out.println(x);
	}
	public static void main(String[]args){
	
		System.out.println("In main");
		Demo obj = new Demo();
		obj.fun(); 			//error:method fun in class Demo cannot be applied to given types 
						//found:int 
						//Required:no arguments
		System.out.println("End main");
	}

}
