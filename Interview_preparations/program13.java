/*
 WAP to find number of even and odd integers in the given array of integers
input:
1
2
5
4
6
7
8
output:
number of even elements : 4
number of odd elements : 3
 */
import java.util.Scanner;
class EvenOddCount {

	public static void main(String[]args) {
		
		Scanner sc  = new Scanner(System.in);
		int size;
		System.out.println("Enter array size");
		size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		int count = 0;
		int count1 = 0;
		for(int i=0;i<arr.length;i++) {
		
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
			
				count++;
			}else{
			
				count1++;
			}
		}
		System.out.println("number of even elements: "+count);
		System.out.println("number of odd elements: "+count1);
	}

}
