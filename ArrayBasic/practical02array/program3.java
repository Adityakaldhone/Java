/* WAP to find sum of even and odd numbers in array display the sum value
 */
import java.io.*;
class Evenoddsum{

	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int size;
		int Even=0;
		int odd = 0;
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
			
				Even = Even + arr[i];
			}else{
			
				odd = odd+arr[i];
			}
		}
		System.out.println("Evensum = "+Even);
		System.out.println("oddsum = "+odd);
		
	}
}
