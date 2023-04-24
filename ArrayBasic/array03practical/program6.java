/*
 Program 6 : WAP to find a palindrome number from an array and return its index.
	     Take size and elements from the user
		Input: 10 25 252 36 564
		Output: Palindrome no 252 found at index: 2 
 */
import java.io.*;
class Pallindrome{
	static int Pallindrome(int arr[],int arr1[]){
		int itr = 0;
		for(int i=0;i<arr.length;i++){
			int num = arr[i];
			int pallindrome = 0;
			while(num!=0){
			
				int rem = num%10;
				pallindrome = pallindrome*10+rem;
				num = num/10;
			}
			if(arr[i]==pallindrome){
			
				arr1[itr] = i;
				itr++;
			}

		}
		return itr;
	}

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		System.out.println("Enter Array size");
		size = Integer.parseInt(br.readLine());
	
		int arr[] = new int[size];	
		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		int arr1[] = new int[arr.length];
		int ret = Pallindrome(arr,arr1);
		if(0<ret){
			
			for(int i=0;i<ret;i++){	
			 System.out.println("Palindrome No " + arr[arr1[i]] + " found at index : " + arr1[i]);
			}
		}
		else{
		
			  System.out.println("Palindrome Number Not Found in an Array");
		}


	}
}

