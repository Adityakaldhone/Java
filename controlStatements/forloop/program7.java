/* Write a program to check the given number is prime number or not   */
class Demo{

	public static void main(String[]args){
		int num = 5;
		int start = 1;
		int count =0;
		for(int i=1;i<=5;i++){
		
			if(j%i==0){
				count++;
			}
		}
		if(count==2){

				System.out.println("prime");

		}
		else{
				System.out.println("not prime");

		}
	}
}
