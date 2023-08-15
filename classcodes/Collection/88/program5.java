//SortedSet methods
import java.util.*;
class SortedSetDemo {

	public static void main(String[]args) {
	
		SortedSet ss = new TreeSet();
		ss.add("aditya");
		ss.add("manish");
		ss.add("ganesh");
		ss.add("dhiraj");
		ss.add("ajinkya");
		ss.add("rohan");
		ss.add("omkar");

		System.out.println(ss.headSet("dhiraj"));
		System.out.println(ss.tailSet("dhiraj"));
		System.out.println(ss.subSet("ganesh" , "rohan"));
		System.out.println(ss.tailSet("dhiraj"));
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss);


	}
}
