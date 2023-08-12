/*Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from the user and find the strong number from them
Input:
n=5
Enter elements in the array:
2
145
6
3
123
2
Output:
145
*/
import java.util.*;

class StrongNumber {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int size;
	
		System.out.println("Enter size of an array ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of an array ");

		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			System.out.println("hiio");
		}
		int itr = 0;
		int num1 = 0;
		while(num1!=arr.length){
			int num = arr[num1];
			int temp = num;
			int temp1 = num;
			int fact = 1;
			while(temp!=0) {
			
				int rem = temp%2;
				int sum = 0;
				for(int i=1;i<=rem;i++) {
				
					fact = fact*i;
					System.out.println("fact"+fact);
				}
				sum = sum+fact;
				temp = temp/10;
			
			if(num==sum) {
			
				System.out.println(num+" is an Strong number in the array at index"+ (num));
				
			}
			}
			num1++;
		}
		
	}
}
