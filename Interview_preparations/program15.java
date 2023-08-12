/*Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
*/
import java.util.Scanner;
class MergeArrays {
	static void Merge(int arr1[] , int arr2[]) {
		int arr3[] = new int[arr1.length+arr2.length];
		int itr = 0;	
		for(int i=0;i<arr3.length;i++) {
			if(i<arr1.length){

			arr3[i] = arr1[i];
			
			}else{
			
				arr3[i] = arr2[itr++];
			}
		}
		System.out.print("Merged Array : ");
		
		for(int i=0;i<arr3.length;i++) {
		
			System.out.print(arr3[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int size1;
		int size2;

		System.out.println("Enter 1st array size");
		size1 = sc.nextInt();
		
		System.out.println("Enter 2nd array size");
		size2 = sc.nextInt();
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		System.out.println("Enter 1st array elements ");
		for(int i=0;i<arr1.length;i++) {
		
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd array elements ");
		for(int i=0;i<arr2.length;i++) {
		
			arr2[i] = sc.nextInt();
		}
		Merge(arr1,arr2);

	}
}
