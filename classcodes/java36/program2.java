/* this loop only works on collection of data and it can be type of class for example array 
 * Drawback : works only on classes with collection of data */
class ForEachDemo{

	public static void main(String[]args){
	
		int arr[] = {10,20,30,40,50};
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
		//For Each Loop
		System.out.println("For each loop : ");
		for(int x: arr){
		
			System.out.println(x);
		}
	}
}
