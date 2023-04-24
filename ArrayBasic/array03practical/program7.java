/*
 Program 7 : WAP to find a Strong number from an array and return its index.
	     Take size and elements from the user
		Input: 10 25 252 36 564 145
		Output: Strong no 145 found at index: 5 
 */
import java.io.*;
class StrongNumber{
	static int Strongnumber(int arr[],int arr1[]){
		int itr = 0;
		for(int i=0;i<arr.length;i++){
			int sum = 0;		
			int num = arr[i];
			while(num!=0){
				int rem = num%10;
				int fact = 1;
			for(int j=1;j<=rem;j++){
			
				 fact = fact*j;
			}
			sum = sum+fact;
			num = num/10;
			}
			if(arr[i] == sum){
			
				arr1[itr] = i;
				itr++;
			}
		}
		return itr;
	}

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int size;
		System.out.println("Enter array size");
		size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		int arr1[] = new int[size];
		int ret = Strongnumber(arr,arr1);
		if(ret!=0){
		
			for(int i = 0 ; i < ret; i++){

				System.out.println("Strong No " + arr[arr1[i]] + " found at index : " + arr1[i]);
			}
                }else{

                        System.out.println("Strong Number Not Found in an Array");
                }
		
	}
}
