 /*WAP to find a composite number from an array and return its index
 * take size and elements from the user 
 * input: 1 2 3 5 6 7
 * output: composite 6 found at index :4
 */
import java.io.*;
class Composite{
	static void composite(int arr[],int size){
	
		for(int i=0;i<size;i++){
			int count = 0;
			int num = arr[i];
			for(int j=1;j<num;j++){
			
				if(num%j==0){
				
					count++;
				}
				
			}
			
				if(count>2){
				
		System.out.println("Composite "+arr[i] + "found at index " +i);
				}
		}
	}
	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		System.out.println("Enter Array Size");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++){

			arr[i] = Integer.parseInt(br.readLine());
		}
			 composite(arr,arr.length);
					 
	}
}
