/* write a program to check the given number is pallindrome or not */
class Pallindrome{

	public static void main(String[]args){
	
		int num = 121;
		int temp = num;
		int pallindrome = 0;
		while(temp!=0){
		
			int rem = temp%10;
			pallindrome = pallindrome*10+rem;
			temp = temp/10;
		}
		if(num==pallindrome){
		
			System.out.println("It is pallindrome");
		}else{
			System.out.println("not an pallindrome");
		}

	}
}

