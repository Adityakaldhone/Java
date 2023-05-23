class Demo{

	static {
	
		System.out.println("Static block 1");
	}
	public static void main(String[]args){
	
		System.out.println("In Demo Main");
	}
}
class client{

	static {
	
		System.out.println("static block 2");
			
	}
	public static void main(String[]args){
	
		System.out.println("In client main");
	}
	static {
	
		System.out.println("static block 3");
	}

}


//if we give client class then output will be Static block 1 and in demo main
//if we give Demo class then output will be Static block 2,static block 3 and in client main
