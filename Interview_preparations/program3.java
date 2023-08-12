/*Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and print accordingly
Input:
n=5
Enter elements in the array :
1
2
3
4
5
Output:
1
2
3
4
5
*/
import java.util.Scanner;
class ArrayInput {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.println("Enter array size");
		size = sc.nextInt();

		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
		
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are ");
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}

	}
}
