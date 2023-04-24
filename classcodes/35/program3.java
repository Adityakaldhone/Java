/* WAP to take size of array from user and also take integer elements from the user print product of odd indexes only 
 * input: Enter size : 6
 * Enter Array elements : 1 2 3 4 5 6 
 * output : 2*2*10 = 48
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
			if(i%2!=0){
			
				product = product* arr[i];
			}
		}
		System.out.println("Sum of odd elements = "+ product);


	}
}
