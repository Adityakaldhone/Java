class Core2Web {
	public static void main(String[] args) {
		int arr = new int[5];

		for(int i = 0;i < arr.length;i++) {
			arr[i] = i*i;
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

// compile time error
