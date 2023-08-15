/*public abstract E lower(E);
  public abstract E floor(E);
  public abstract E ceiling(E);
  public abstract E higher(E);
  public abstract E pollFirst();
  public abstract E pollLast();
  *///
//NavigableSet methods
import java.util.*;
class SortedSetDemo {

	public static void main(String[]args) {
	
		NavigableSet ss = new TreeSet();
		ss.add("aditya");
		ss.add("manish");
		ss.add("ganesh");
		ss.add("dhiraj");
		ss.add("ajinkya");
		ss.add("rohan");
		ss.add("omkar");

		System.out.println(ss.ceiling("omkar"));
		System.out.println(ss.floor("omkar"));
		System.out.println(ss.higher("Aditya"));
		System.out.println(ss.pollFirst());
		System.out.println(ss.pollLast());
		System.out.println(ss);


	}
}
