// NumberFormatException Handling

import java.io.*;

class ExceptionDemo {

	public static void main(String[]args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);
		
		int data = 0;
		try {
		
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj) {
		
			System.out.println("please Enter integer data ");
			data = Integer.parseInt(br.readLine());
		}
		
		System.out.println(data);

	}
}
/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Exception_Handling/75# java ExceptionDemo
Aditya
Aditya
kaldhone
please Enter integer data
7
7
 */
