class fibonacci{

	public static void main(String[]args){
	
		int num = 9;
		int first = 0;
		int second = 1;
		System.out.println(first+ "  " +second);
		for(int i=3;i<=num;i++){
		
			int third = first+second;
			first = second;
			second = third;
			System.out.println(third);
		}
	}
}
