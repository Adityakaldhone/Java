/* protected void removeRange(int, int);*/
import java.util.*;
class ArrayListDemo extends ArrayList {
	public static void main(String[]args) {

	ArrayListDemo al = new ArrayListDemo();
	int num = 1;
	for(int i=0;i<10;i++) {
		
		al.add(num+10);
		num++;
	}
	System.out.print(al);

	//protected void removeRange(int , int );
	al.removeRange(5 , 8);
	System.out.println(al);
	}
	

}
