// try, catch & finally

class Demo {

	public static void main(String[]args) {
	
		System.out.println("Start main");      //Risky code
	
		try {
	
			System.out.println(10/0);
		}catch(ArithmeticException obj){
	
			System.out.println("Exception occured");  //Handling code
		}
		System.out.println("End main");
	}

}

/*
output: 
Start main
Exception occured
End main
 */
