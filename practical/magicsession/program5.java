/*Write a program to print square of even numbers in given number */
class Count{

	public static void main(String[]args){
		int num = 942111243;
		int count = 0;
		while(num!=0){
			int rem = num%10;
			num/=10;
			if(rem%2==0){

			System.out.println(rem*rem);
			}
		}
	}
}
