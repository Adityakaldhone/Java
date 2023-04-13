class Armstrong{

	public static void main(String[]args){
	
		int num = 153;
		int sum = 0;
		int count = 0;
		int temp1 = num;
		int temp2 = num;
		while(temp1!=0){
		
			temp1 = temp1/10;
			count++;
		}
		for(int i=1;i<=count;i++){
			int rem = temp2%10;
			int mul = 1;
			int ct = count;
			while(ct!=0){
				mul = mul*rem;
				ct--;
				}
			temp2 = temp2/10;
			sum = sum + mul;
			}
		if(sum == num){
		
			System.out.println("armstrong number");
		}
		else{
		
			System.out.println("not an armstrong number");
		}
	}
}
