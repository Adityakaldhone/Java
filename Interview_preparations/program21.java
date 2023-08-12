/*Write a program to print prime numbers in such a manner that,
If the prime number is a single digit it should be in the first row,
If the prime number is a double-digit below 50, should be in the second row,
If the prime number is a double-digit above 50, should be in the third row,
If the prime number is a three-digit below 120, should be in the fourth-row
Output:
2 3 5 7
11 13 17 19 23 31 41 43 47
53 59 61 67 71 73 79 83 89 97
101 103 107 109 113
*/
class PrimeDemo {

	public static void main(String[]args) {
		
		int num = 1;
		int num1 = 1;
		int itr1 = 0;
		int itr = 0;
		int itr2 = 0;
		int itr3 = 0;
		int arr[] = new int[itr];
		int arr1[] = new int[itr1];
		int arr2[] = new int[itr2];
		int arr3[] = new int[itr3];
		for(int i=1;i<=120;i++) {
			int count = 0;

				if(num%i == 0 && i<=num){
				 
					count++;		
				}
			if(count < 2) {
			
				if(num<10) {
					arr[itr] = num;
					itr++;
				}else if(num >=10 && num <=50) {
				
					arr1[itr1] = num;
					itr1++;
				}else if(num > 50 && num<100) {
				
					arr2[itr2] = num;
					itr2++;
				}else {
					arr3[itr3] = num;
					itr3++;
				}
			}
			num = i;
		}
		for(int i=0;i<arr.length;i++) {
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
		
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
		
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for(int i=0;i<arr3.length;i++) {
		
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

	}
}
