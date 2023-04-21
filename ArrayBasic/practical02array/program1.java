/* Write a rogram to create an array of n intes=ger elements 
 * where n values are taken from the user 
 * inseret the values from the users and find the sum of all elements in the array 
 */
import java.io.*;
class Sum{

	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size;
		int sum = 0;
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}
		System.out.println("sum = "+sum);
		
	}
}
