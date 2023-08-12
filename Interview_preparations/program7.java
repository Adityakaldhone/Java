/*
 write an program to take an of n integer elements. where n value should taken from the user
 insert values from the user and find the sum of all the  element in the array
 */
import java.io.*;
class Sum {

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		System.out.println("Enter size of an array");
		size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int sum = 0;
		System.out.println("Enter elements in array");
		
		for(int i=0;i<arr.length;i++){
		
			arr[i]  = Integer.parseInt(br.readLine());
			
			sum = sum + arr[i];
		}
		System.out.println("sum of all the elements in array : "+ sum);
	}
}	
