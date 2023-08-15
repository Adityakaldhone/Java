//Collections class
import java.util.*;
class SortDemo {

	public static void main(String[]args) {
	
		ArrayList al = new ArrayList();

		al.add("Kanha");
		al.add("Ashish");
		al.add("Badhe");
		al.add("Rahul");
		al.add("Shashi");
		al.add("Rajesh");

		System.out.println(al);

		Collections.sort(al);
		
		System.out.println(al);

	}
}
