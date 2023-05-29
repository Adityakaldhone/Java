class Demo{

	int x = 10;

	Demo(){
	
		System.out.println(this.x);                  
		System.out.println(x);
		System.out.println("No args constructor");
	}

	
	Demo(int x){

		System.out.println(this.x);
		System.out.println(x);
		System.out.println(" para constructor");
	}


	public static void main(String[]args){
	
		Demo obj = new Demo();
		Demo obj1 = new Demo(20);
	}
}

/*o/p:
 *  
 *  10
 *  10
 *  no args constructor
 *  10
 *  20
 *  para constructor*
 */
