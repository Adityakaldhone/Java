/* Write a program to check the given number is perfect number or not */
class Perfect{

	public static void main(String[]args){
	
		int num = 6;
		int sum = 0;
		for(int i=1;i<num;i++){
		
			if(num%i==0){
			
				sum = sum+i;
			}
		}
		if(sum==num){
		System.out.println("perfect number");
		}
		else{
		
			System.out.println("Not an perfect numeber");
		}
	}
}
