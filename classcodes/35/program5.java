/* WAP to take 10 input from the user and print elements that only divisible by 5
 * Enter Array elements : 10 2 2 3 3 3 4 4 25 55 
 * output : 10 25 55
 * 
*/
import java.io.*;
class ArrayInput{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.println(""+arr[i]);
			}
		}
	}
}
