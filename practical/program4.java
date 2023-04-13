/*calculate profit or loss 
 * Write a program that takes the cost price and selling price and calculates its profit or loss */
class Calculation{

	public static void main(String[]args){
	
		int costprice = 1200;
		int sellingprice = 1000;
		if(costprice > sellingprice){
		
			System.out.println(costprice-sellingprice+  "of profit");
		}
		else if(costprice < sellingprice){
		
			System.out.println(sellingprice-costprice+  "of loss");
		}else
			System.out.println("no profit no loss");
	}
}
