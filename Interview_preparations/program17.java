/*WAP to remove a specific element from an array.
Input:
1
2
4
5
6
Enter element to remove : 4
Output:
1
2
5
6*/
import java.util.Scanner;
class RemoveSpecificElement {

	static void removeEle(int arr[] , int ele) {
		int itr = 0;
		int flag = 0;
		int itr1 = 0;
		int arr1[] = new int[arr.length-itr];
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i] == ele) {
				
				itr--;
				flag = 1;
				
				
			}else{
			
				arr1[itr1] = arr[i];
				itr1++;
			}
		}
		if(flag==0){
			System.out.println("Element is not present in the array");
		}else{
			for(int i=0;i<itr1;i++) {
		
				System.out.println(arr1[i]);
			}		
		}
	}
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size of an array");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
		}
		int ele;
		System.out.println("Enter element to remove : ");
		ele = sc.nextInt();
		removeEle(arr , ele);
	}
}
