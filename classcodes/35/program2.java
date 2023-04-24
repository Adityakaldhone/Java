/* WAP to take size of array from user and also take integer elements from the user print product of even elements only 
 * input: Enter size : 9
 * Enter Array elements : 1 2 3 4 2 77 55 10
 * output : 2*2*10 = 40
 * 
*/
import java.io.*;
class ArrayInput{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		int product = 1;
		System.out.println("Enter Array Size");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
			
				product = product* arr[i];
			}
		}
		System.out.println("Sum of odd elements = "+ product);


	}
}
