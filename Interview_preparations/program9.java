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
			int rem = 0;
			int temp = arr[i];
			int temp1 = arr[i];
			int sum = 0;
				while(temp!=0){
					 rem = temp%2;
					 sum = sum*10+rem;
					 temp = temp/10;
			        }
				if(arr[i]==sum){
				
					System.out.println(arr[i]+ " is a strong number at index "+ i);
				}
		}

		}
		
	}

