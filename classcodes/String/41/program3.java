class Nullpointer{

	public static void main(String[] args){
	
		int arr[][] = {{},{},{}};

		int arr2[][] = new int[2][];

		System.out.println(arr.length);         //3
		System.out.println(arr[0].length);      //0
		
		System.out.println(arr2.length);        //2
		System.out.println(arr2[0].length);     // error:Null pointerException
							
	}
}
