/*Write a program in java to accept three numbers and check whether they are pythagorian triplet or not */
class Triplet{

	public static void main(String[]args){
		int a =3;
		int b = 4;
		int c = 5;
	
		if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
		
			System.out.println("it is an pythagorian triplet");
		}else{
		
			System.out.println("not an pythagorian triplet");
		}
	}
}
