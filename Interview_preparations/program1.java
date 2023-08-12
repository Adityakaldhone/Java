/*Write a program to create an array of 5 integer elements.
And print all 5 elements from an array (take hardcoded values in the array)
Output :
1
2
3
4
5
*/
class ArrayDemo {

	public static void main(String[]args) {
	
		int arr[] = new int[]{1,3,5,7,9};

		for(int i=0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		}
	}
}
