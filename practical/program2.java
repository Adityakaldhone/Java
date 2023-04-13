/*write a program to find maximum between three numbers
 * input 1: 
 * num1=1
 * num2=2
 * num1=3
 * input 3:
 * num1=3
 * num2=3
 * num3=3
 */
class Max{

	public static void main(String[]args){
	
		int num1 = 3;
		int num2 = 4;
		int num3 = 3;
		if(num1>num2 && num1>num3){
		
			System.out.println(num1+ "is greater");
		}
		else if(num2>num1 && num2>num1){
		
			System.out.println(num2+ "is greater");
		}
		else if(num3>num2 && num3>num3){
		
			System.out.println(num3+ "is greater");
		}
		else if(num1==num2 && num1<num3){
		
			System.out.println(num3+ "is greater");
		}
		else if(num1==num3 && num1<num2){
		
			System.out.println(num2+ "is greater");
		}
		else if(num2==num3 && num2<num1){
		
			System.out.println(num1+ "is greater");
		}
		else{
		
			System.out.println("both are equal");
		}
	}
}
