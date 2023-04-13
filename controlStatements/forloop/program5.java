/*count of factors of number */
class Count{

	public static void main(String[]args){
	
		int num = 5;
		int count = 0;
		for(int i=1;i<=5;i++){
		if(num%i==0){
		count++;
		}
		}
		System.out.println(count);
	}
}
