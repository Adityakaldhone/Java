/* CarryForward */
class CarryForward{

	public static void main(String[]args){
	
		int arr[] = {5,-2,4,-7,3,9,8,7};
		int max = arr[0];
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
		
			if(max < arr[i]){
			
				max = arr[i];
				arr1[i] = max;
			}else{
			
				arr1[i] = max;
			}
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr1[i]);
		}
	}
}
