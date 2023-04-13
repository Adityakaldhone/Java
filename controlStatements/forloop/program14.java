/* Write a program to check the given number is automorphic or not */
class Demo{

	public static void main(String[]args){
	
		int num = 625;
		int temp = num;
		int temp1 = num*num;
		int sqr = 1;
		int count = 0;
		while(temp!=0){
		
			count++;
			sqr = sqr*10;
			temp = temp/10;
		}
			int rem = temp1%sqr;
			if(num==rem){
			
				System.out.println("automorphic number");
			}else{
			
				System.out.println("not an automorphic number");
			}
	}
}
