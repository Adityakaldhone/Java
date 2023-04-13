/*Write a program to count the digits of the given number */
class Count{

	public static void main(String[]args){
		int num = 942111243;
		int count = 0;
		while(num!=0){
	
			num/=10;
			count++;
		}
		System.out.println(count+" is the count of digits of that given number");
	}
}
