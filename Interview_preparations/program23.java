//write a program to find min and max from the given array
//imput: [1,43.65,71,89,55]
//output: min = 1;
 //       max = 89
import java.util.*;
class Min_Max {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter array size");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++)  {
		
			if(arr[i] < min) {
			
				min = arr[i];
			}
			if(arr[i] > max) {
			
				max = arr[i];
			}
		}
	System.out.println("min = "+ min + "\n" + "max = " + max);	

	}
}
