/*
 * 1 
 * 4 3 
 * 16 5 36
 * 49 8 81 10
 */
class Practical3second{
	public static void main(String[]args){
	int num = 1;
	for(int i=1;i<=4;i++){
	
		for(int j=1;j<=i;j++){
		
			if(j%2!=0){
			
				System.out.print(num*num +" ");
			}else{
			
				System.out.print(num+ " ");
			}
			num++;
		}
		System.out.println();
	}
	}
}
