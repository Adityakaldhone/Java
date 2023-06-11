/*
 Write a program to create an array of 5 integer elements.
Insert from the user and print 5 elements from an array
Input:
1
2
3
4
5
Output :
1
2
3
4
5
 */ 
import java.io.*;
class Demo {
	
	public static void main(String[]args) throws IOException {
	
		System.out.println("Insert any 5 numbers ");
		int arr[] = new int[5];
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<arr.length;i++) {
	
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("The five numbers you entered are ");

		for(int i=0;i<arr.length;i++) {
	
			System.out.println(arr[i]);
		}
	}
}
