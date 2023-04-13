class Strongnumber{

	public static void main(String[]args){
	
		int num = 145;
		int temp = num;
		int count = 0;
		int sum = 0;
		int rem = 0;
		while(temp!=0){
			int fact = 1;
			 rem = temp%10;
			for(int j=1;j<=rem;j++){
				fact = fact*j;
				System.out.println(fact+"fact");
			}
			temp = temp/10;
			sum = sum  + fact;
			System.out.println(sum);
		}
		if(sum == num){
			System.out.println("Strong number");
		}
		else{
		
			System.out.println("not a strong number");
		}
	}
}
