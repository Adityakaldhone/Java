/*
 Write a program to find the common elements between two arrays 
imput :
Enter first array
1
2
3
5
Enter second array
2
1
9
8
output:
1
2
 */
import java.util.Scanner;
class CommonElements {

	void common(int arr1[] , int arr2[]) {
			
		for(int i=0;i<arr1.length;i++) {
			int flag = 0;
		
			for(int j=0;j<arr2.length;j++) {
			
				if(arr1[i]==arr2[j]) {
		
					flag = 1;
					break;
				}
			}
			if(flag==1) {
			
				System.out.println(arr1[i]);
			}
		}
	}

	public static void main(String[]args) {
		CommonElements obj = new CommonElements();
		Scanner sc = new Scanner(System.in);
		int size1;
		int size2;
		System.out.println("Enter size of 1st array");
		size1 = sc.nextInt();
		
		System.out.println("Enter size of 2nd array");
		size2 = sc.nextInt();
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		System.out.println("Enter elements of 1st array");
		for(int i=0;i<arr1.length;i++) {
		
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter elements of 2nd  array");
		for(int i=0;i<arr1.length;i++) {
		
			arr2[i] = sc.nextInt();
		}
		obj.common(arr1,arr2);


	}
}

