// try with multiple catch
import java.io.*;
class Demo {

	public static void main(String[]args) {
	
		for(int i=0;i<10;i++){
		
			System.out.println("In Loop");

			try {

			Thread.sleep(2000);
			
			}catch(InterruptedException obj) {
			

			}catch(IOException obj){
			
			}
		}
	}
}
/*
output:
program5.java:18: error: exception IOException is never thrown in body of corresponding try statement
                        }catch(IOException obj){
                         ^
1 error
 */
