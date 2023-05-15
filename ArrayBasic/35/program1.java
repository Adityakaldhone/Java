/* WAP to take size of array from user and also take integer elements from the user print sum of odd elements only 
 * input: Enter size : 5
 * Enter Array elements : 1 2 3 4 5 
 * output : 9
 * 1+3+5
*/
import java.io.*;
class ArrayInput{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		int sum = 0;
		System.out.println("Enter Array Size");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2!=0){
			
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of odd elements = "+ sum);


	}
}
