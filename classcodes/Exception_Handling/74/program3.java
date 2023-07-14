//**NumberFormatExecption**
import java.io.*;
class Demo {

	void Getdata() throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data = Integer.parseInt(br.readLine());
	}
	public static void main(String[]args) throws IOException {
	
		Demo obj = new Demo();
		obj.Getdata();
	}

}
/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Exception_Handling/74# java Demo
Aditya
Exception in thread "main" java.lang.NumberFormatException: For input string: "Aditya"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:784)
        at Demo.Getdata(program3.java:8)
        at Demo.main(program3.java:13)
 */
