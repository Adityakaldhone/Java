/* Command Line Argument */
class CommandLineArgument{

	public static void main(String[]args){
	
		int arr[] = {10,20,30};
		for(int i=0;i<args.length;i++){
		
			System.out.println(args[i]);
		}
	}
}
/* javac program6.java
 * java CommandLineArgument 10 20 30 40 
 * OUTPUT : 
 * 10
 * 20
 * 30
 * 40
 *
 * javac program6.java
 * java CommandLineArgument Aditya Manish Rohan Dhiraj Ganesh Omkar Ajinkya
 * OUTPUT:
 * Aditya
 * Manish
 * Rohan
 * Dhiraj
 * Ganesh
 * Omkar 
 * Ajinkya
 */
