/*
 write a program to search a given element and print its index 
input: [1,2,43,56,75,90];
search = 43;
output: index = 2
 */
import java.io.*;
class SearchEle {

	public static void main(String[]args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		System.out.println("Enter array size");
		size = Integer.parseInt(br.readLine());
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter element to search ");
		int search = Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i] == search) {
			
				System.out.println("index = " + i);
			}
		}
		
	}
}
