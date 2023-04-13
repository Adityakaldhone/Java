/* Electricity bill problem 
 * Given an integer input A which represents units of electricity consumed at your house 
 * units <=100 price per unit is 1 
 *
 * units >100 price per unit is 2
 * input 1 = 50
 * output  = 50
 * input = 200
 * output = 300
 */
class Electricity{

	public static void main(String[]args){
	
		int x = 200;
		if(x<=100){
		
			System.out.println(x);
		}else if(x>100){
		
			System.out.println(2*(x-100)+100);
		}
	
	}
}
