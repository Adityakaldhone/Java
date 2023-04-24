/* WAP to take 7 characters as input print only vowels from the array
 * Input : a b c o d p e 
 * output : a o
 * 
*/
import java.io.*;
class ArrayInput{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = new char[7];
		System.out.println("Enter Array elements");
		for(char i=0;i<arr.length;i++){
			arr[i] = (char).(br.readLine());
		}
		for(char i=0;i<arr.length;i++){
			if(char[i]==a || char[i] == e || char[i]==o ||char[i] == i || char[i] == u){
				System.out.println(""+  char[i]);
			}
		}
	}
}
