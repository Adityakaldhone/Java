/*
Q2.

Write a program in which ask the user to enter a number from 0 to 5 and print it's spelling,if the
entered number is greater than 5 print entered number is greater than 5

e.g
Input -Enter a number - 4
Output - four

*/
import java.util.Scanner;
class Switch_demo{

	public static void main(String[] args){

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter The no");
		int no=obj.nextInt();

		switch(no){

			case 0:

			System.out.println("Zero");
			break;

			case 1:

			System.out.println("one");
			break;

			case 2:

			System.out.println("Two");
			break;

			case 3:

			System.out.println("Three");
			break;

			case 4:

			System.out.println("four");
			break;

			case 5:
			System.out.println("five");

			default:

			System.out.println("no Is Greater Than 5");
		}
	}
}
