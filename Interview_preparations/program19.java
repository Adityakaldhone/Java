/*Write a program to create a 2x2 2d array of integer elements.
And print all elements from a 2d array (take hardcoded values in array)
Output :
1 2
3 4*/
class Demo {

	public static void main(String[]args) {
	
		int[][] arr = { {1 ,3} ,{5, 7} };

		for(int i=0;i<arr.length;i++) {
		
			for(int j=0;i<arr[i].length;j++) {
			
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();

		}
		 /*int[][] array = { { 1, 2 }, { 3, 4 } };

        // Print all elements from the 2D array
        	for (int i = 0; i < array.length; i++) {
            		for (int j = 0; j < array[i].length; j++) {
                		System.out.print(array[i][j] + " ");
            		}

		}*/
	}
}
