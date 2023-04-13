class fibo{

	public static void main(String[]args){
	
		int num = 12;
		int first = 0;
		int second = 1;
		for(int i=1;i<=num;i++){
		
			System.out.println(first);
			int third = first + second;
			first = second;
			second = third;
		}
	}
}
