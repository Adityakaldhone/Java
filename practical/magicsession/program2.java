/*write a program to print an factorial of an given number */
class Fact{

	public static void main(String []args){
		int i=1;
		int fact = 1;
		int num = 5;
		while(i<=num){
		
			fact = fact*i;
			i++;
		}
		System.out.println(fact+ "is the factorial of an given number");
	}
}
