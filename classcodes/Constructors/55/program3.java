/*              ----------------------------------------------Instance---------------------------------------------------//
 *		||						||							||
 *		||						||							||
 *		||						||							||
 *	instance variable				instance block   					instance method
 *															|
 *														|---------------|
 *														|		|
 *														|		|
 *														|		|
 *													Constructor	non-static methods
 *
 *
 */

class Demo{

	int x = 10;

	Demo(){
	
		System.out.println("Constructor");
	}
	{
	
		System.out.println("instance block");
	}

	public static void main(String[]args){
	
		Demo obj = new Demo();
		System.out.println("In main");
	}
	{
	
		System.out.println("Instance block 2");
	}
}
