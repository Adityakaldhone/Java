/* WAP to print count of digits in elements of array 
 * input: Enter array elements: 02 255 2 1554
 * output:2 3 1 4 
 */
import java.io.*;
class Digitcount{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		System.out.println("Enter array size");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
		
			int num = arr[i];
			int count = 0;
			while(num!=0){)	
				count++;
				num = num/10;
			}
			System.out.println("Count = "+count);
		}

	}
}	
