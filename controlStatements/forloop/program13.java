/* write a program to check the greatest common divisor */
class GCD{

	public static void main(String[]args){
	
		int num1 = 12;
		int num2 = 18;
		int GCD = 1;
		for(int i=1;i<=num1 && i<=num2;i++){
		
			if(num1%i==0 && num2%i==0){
			
				GCD=i;
			}
		}
		System.out.println(GCD+ " id the greatest common divisor between two numbers");
	}
}
