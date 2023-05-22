class Core2Web {

	public static void main(String[]args) {

		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};

		int arr2[][] = {{21,32,43,69,523},{432,235,326,3242,24124},{1243,22121,3131,121242}};

		int arr3[][] = {{12,11},{42,15},{17,28},{10,11}};

		int arr[][][] = new int[3][][];

		arr[0] = arr1;
		arr[1] = arr2;
		arr[2] = arr3;

		System.out.println(arr[1][2][3]);
	}
}

//121242 
