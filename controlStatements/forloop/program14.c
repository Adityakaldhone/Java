/* Write a program to check the given number is automorphic or not */
class Demo{

	public static void main(String[]args){
	
		int num = 25;
		int temp = num;
		int temp1 = num*num;
		int sqr = 1;
		int count = 0;
		while(temp!=0){
		
			count++;
			temp = temp/10;
		}
		while(count!=0){
		
			sqr = sqr*10;
			count--;
		}
			rem = temp2%sqr;
			if(num==rem){
			
				System.out.println("automorphic number");
			}else{
			
				System.out.println("not an automorphic number");
			}
	}
}
