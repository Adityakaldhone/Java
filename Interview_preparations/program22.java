// erite a program to sum alternate numbers from the given array
// input: [1,2,3,4,5,6,7]
// output: 16  1+3+5+7
import java.util.*;
class AlternateSum {

	public static void main(String[]args) {
		int sum = 0;
		Scanner sc  = new Scanner(System.in);
		int size;
		System.out.println("Enter array size");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");

		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i+=2) {
		
			sum = sum + arr[i];
			
		}
		System.out.println("Alternate sum = "+ sum);

	}
}
