
class Integer{

	public static void main(String[]args){
	
		int x = 7;
		if(x%5==0 && x%3==0){
		
			System.out.println("fizz-buzz");
		}
		else if(x%3==0){
		
			System.out.println("fizz");
		}else if(x%5==0) {
		
			System.out.println("buzz");
		}else{
		
			System.out.println("Not Divisible by both");
		}
	}
}

