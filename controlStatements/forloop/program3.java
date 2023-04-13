/* Write a program to print the factorial of the given number*/
class Demo{

	public static void main(String[]args){
		int fact = 1;
		int num = 5;
		for(int i=1;i<=5;i++){
			fact = fact*i;
		}
		System.out.println(fact+" is the factorial of the given number");
	}
}
