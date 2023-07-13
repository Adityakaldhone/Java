/*
Exception has two types 1.compile time Exception
			2.runtime Exception
*/
//1.IOException(Compile Time)

import java.io.*;

class Demo {

	public static void main(String[]args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();           //error
	}
}
/*error:program1.java:14: error: unreported exception IOException; must be caught or declared to be thrown
                String str = br.readLine();
                                        ^
1 error
*/
