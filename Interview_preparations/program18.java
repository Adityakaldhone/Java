/*WAP to take input from the user into an array and remove duplicate numbers.
Input: 1 2 2 3 3 3 4 4 5
Output: 1 2 3 4 5
*/
import java.util.Scanner;
class RemoveDuplicate {

	static void removeDup(int arr[]) {
		int arr1 = new int[arr.length];
		int itr = 0;
		int itr1 = 0;
		for(int i=0;i<arr.length;i++) {
		
			int num = arr[i];

			for(int j=0;j<arr.length;i++) {
			
				if(num==arr[j]){
				
					itr--;
				}else {
				
					arr1[j] = arr[j];
					itr1++;
				}
			}
			

		}

	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		int size;

		System.out.println("Enter array size");
		size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array elements");
		for( int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		removeDup(arr);
	}
	
}
