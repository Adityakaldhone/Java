/*
 Q3.

Write a program in which user should enter two numbers if both the numbers are positive
multiply them and provide to switch case to verify number is even or odd, if user enters any
negative number program should terminate saying “Sorry negative numbers not allowed”.

*/
import java.util.Scanner;
class Switch_Demo{

	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter The No1");
		int no1=obj.nextInt();

		System.out.println("Enter The No2");
		int no2=obj.nextInt();

		if(no1<0 || no2<0){

			

			System.out.println("Sorry negative numbers not allowed");
		}

		int no3=no1*no2;

		System.out.println(no3);

		int no4=no3%2;

		switch(no4){

			case 0:
				System.out.println("no is a even ");
				break;

			case 1:
				System.out.println("no is odd");
				break;

			default:
				System.out.println("Invalid Input");
				break;
		}
	}
}
