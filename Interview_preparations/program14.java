/*
 write a program to find the sum of even and odd numbers in an array
example:
Array = {11,12,13,14,15}
odd numbers sum = 39
even numbers sum = 26
 */ 
import java.util.Scanner;
class Sum {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter array size");
		size = sc.nextInt();
		int arr[] = new int[size];
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
			
				sum1 = sum1 + arr[i];
			}else{
				sum2 = sum2+arr[i];
			}
		}
		System.out.println("odd numbers sum: "+sum2);
		System.out.println("even numbers sum: "+sum1);
	}
}
