 /* WAP to find a prime number from an array and return its index 
 * Take size and elements from the user 
 * imput: 10 25 36 566 34 53 50 100
 * output: prime number 53 found at index number 4
 */
import java.io.*;
class Prime{
	static int prime(int arr[],int size,int arr1[]){
		int itr =0;
		for(int i=0;i<size;i++){
			int count = 0;
			int num = arr[i];
			for(int j=1;j<=num;j++){
			
				if(num%j==0){
				
					count++;
				}
				
			}
			
			if(count==2){
				arr1[itr] = i;
				itr++;
			}
			
		}
		return itr;
		
		
	}
	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		System.out.println("Enter Array Size");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		int arr1[] = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++){

			arr[i] = Integer.parseInt(br.readLine());
		}
			int ret =  prime(arr,arr.length,arr1);
			if(ret==0){
			
				System.out.println("No prime numbers are found in array");
			}
			else{
			
				for(int i=0;i<ret;i++){	
					System.out.println(arr1[i]);
				System.out.println("prime number "+ arr[arr1[i]] + "at index "+arr1[i]);
			}
		}
					 
	}
}
