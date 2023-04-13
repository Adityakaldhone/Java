/*Write a program to count the digits of the given number */
class Count{

	public static void main(String[]args){
		int num = 942111243;
		int count = 0;
		while(num!=0){
			int rem = num%10;
			num/=10;
			if(rem%2!=0){

			count++;
			}
		}
		System.out.println(count+" is the count of odd  digits of that given number");
	}
}
