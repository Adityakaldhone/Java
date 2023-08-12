/*
 write an program to take an of n integer elements. where n value should taken from the user
 insert values from the user and find the frequency of digit
 */
import java.io.*;
class Sum {

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		System.out.println("Enter size of an array");
		size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter elements in array");
		
		for(int i=0;i<arr.length;i++){
		
			arr[i]  = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr.length;i++) {
		
			int count = 0;
					//System.out.println("in for"+arr[i]);
			int freq = arr[i];
			for(int j=0;j<arr.length;j++) {
			
					//System.out.println("in if else"+arr[j]);
				if(freq == arr[j] && arr[j] != -1 ){
					System.out.println("in if else"+arr[j]);
					arr[j]= -1;
					count++;
				}
			}
			System.out.println(" frequency of "+ arr[i] + " is "+count);
		}	
	}
}	
