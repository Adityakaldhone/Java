
import java.io.*;
class ConditionalStatement{

	public static void main(String[]args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte b = (byte) Integer.parseInt(br.readLine());
			if(b >=90) {
			
				System.out.println("cycle");
			}else if(b<=0)
			{
			System.out.println("Ghari ja ani pogo bgh");
			}
			else {
			
				System.out.println("Buffelo");
			}
			
	}

}

