//User defined exceptions
import java.util.Scanner;
class Dataunderflowexception extends RuntimeException {

	Dataunderflowexception(String msg) {
	
		super(msg);
	}
}
class Dataoverflowexception extends RuntimeException {

	Dataoverflowexception(String msg) {
	
		super(msg);
	}
}

class ArrayDemo {

	public static void main(String[]args) {
	
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer value");
		System.out.println("Note: 0< element <100");

		for(int i=0;i<arr.length;i++) {
		
			int data = sc.nextInt();
		
		if(data<0){
		
			throw new Dataunderflowexception("please give number greater than 0");
		}else if(data>100){
		
			throw new Dataoverflowexception("please give number less than 100");
		}
		}
	}
}
