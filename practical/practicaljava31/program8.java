/*
 * Write a program to print following pattern Take number of rows from the user
$
@ @
& & &
# # # #
$ $ $ $ $
@ @ @ @ @ @
& & & & & & &
# # # # # # # #*/
import java.io.*;
class Demo{

	public static void main(String[]args)throws IOException{
	
		int num = 1;
		System.out.println("Enter number of rows");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
		
			if(num==5){
			
				num = 1;
			}
			for(int j=1;j<=i;j++){
				
				if(num==1){
				
					System.out.print("$ ");
				}
				if(num==2){
				
					System.out.print("@ ");
				}
				if(num==3){
				
					System.out.print("& ");
				}
				if(num==4){
				
					System.out.print("# ");
				}
				
				
			}
			num++;
			System.out.println();
		}
	}
}

