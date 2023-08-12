//write a program to sort array in ascending order
/*
input : Enter the length of array
n=3
Enter the elements in the array
6
8
3
output:
3
6
8
 */
import java.util.Scanner;
class Sort {
	public static void sorting(int arr[]) {
	
		for(int i=0;i<arr.length-1;i++) {
		
			for(int j=0;j<arr.length-1-i;j++) {
			
				if(arr[i] < arr[j]) {
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		}
	
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter array size");

			size = sc.nextInt();
		
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		sorting(arr);

	}
}
