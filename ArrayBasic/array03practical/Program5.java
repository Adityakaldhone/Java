/*WAP to find a perfect number from an array and return its index
 * Take size and elements from the user 
 * input: 10 25 252 496 564 
 * output : perfect number 496 found at index 3
 */
import java.io.*;
class Perfect{
	static int perfect(int arr[],int arr1[]){
		int itr = 0;
		for(int i=0;i<arr.length;i++){
			int sum = 0;
			int num = arr[i];
			for(int j=1;j<=num;j++){
			
				if(num%j==0){
				
					sum = sum + j;
					
				}
			}
			if(arr[i]==sum){
			arr1[itr] = i;
			itr++;
			System.out.println("2");
			}

		}
		return itr;
	}

	public static void main(String[]args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		System.out.println("Enter array size");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		//int arr1[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		int arr1[] = new int[arr.length];
		int ret = perfect(arr,arr1);
		if(0 <= ret){

                        for(int i = 0 ; i <= ret; i++){

                                System.out.println("Perfect No " + arr[arr1[i]] + " found at index : " + arr1[i]);
                        }
                }else{

                        System.out.println("Perfect Number Not Found in an Array");
                }
	}
}
