/*
 Program 9 : Write a program to print the second max element in the array
		Input: Enter array elements: 2 255 2 1554 15 65
		Output: 255  
 */
import java.io.*;

class SecondMax{

        static int Secondmax(int arr[]){

                for(int i = 0;i < arr.length-1;i++){
			
			for(int j = 0;j < arr.length-1-i;j++){

				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j  + 1] = temp;
				}
			}
			if(i==2){
			
				break;
			}
		}
		return arr[arr.length - 2];
        }

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		System.out.println("Enter array Size");
		size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Secondmax(arr));
	}
}
