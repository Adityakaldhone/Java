/* WAP to find the number of even and odd integers in a given array of integers 
 * input: 1 2 5 4 6 7 8 
 * output:
 * number of even elements : 4
 * number of odd elements : 3 
 */
import java.io.*;
class Sum{

	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size;
		int Evencount=0;
		int oddcount = 0;
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
			
				Evencount++;
			}else{
			
				oddcount++;
			}
		}
		System.out.println("Evencount = "+Evencount);
		System.out.println("oddcount = "+oddcount);
		
	}
}
