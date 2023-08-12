/*Print this pattern using an array.
Take row value from the user (note: you can use jagged array)
*
* *
* * *
* * * *
*/
class StarPatt{

	public static void main(String[]args) {
	
		for(int i=0;i<4;i++) {
		
			for(int j=0;j<=i;j++) {
			
				System.out.print( "* ");
			}
			System.out.println();
		}
	}
}
