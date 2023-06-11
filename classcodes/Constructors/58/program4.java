import java.util.*;
class Demo{

	private int x = 10;
	private String name = "sachin";

	Demo(int x,String name){
		this.x = x;
		this.name = name;

		System.out.println("In Demo");
	}

}

class Client {

	public static void main (String[]args){
	
		Scanner sc = new Scanner(System.in);
		Demo obj1 = new Demo(7,"MSD");

		String str1 = new String("Aditya");

		String str2 = "kaldhone";
		str2 = "jitendra";

		//scanner sc = new scanner(System.in);
		String str3 = sc.next();
	}
}
