/* WAP to print reverse elements in array take size and elements from the user 
 *
 * input:10 25 252 36 564
 * output: 01 52 252 63 465
 */
import java.io.*;
class Reverse{
static void Reverseelement(int arr[],int size){
	for(int i=0;i<size;i++){
		int reverse = 0;
		int num = arr[i];
		while(num!=0){
		int rem = num%10;
		reverse = reverse*10+rem;
		num = num/10;

		}
		System.out.println("reverse = "+reverse);
	}
}


	public static void main(String[]args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int size;
	System.out.println("Enter Array Size");
	size = Integer.parseInt(br.readLine());
	int arr[] = new int[size];
	System.out.println("Enter array elements");
	for(int i=0;i<arr.length;i++){
	
		arr[i] = Integer.parseInt(br.readLine());
	}
	 Reverseelement(arr,arr.length);
//	System.out.println(index);

}
}
