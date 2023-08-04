//1.ArrayList(class)
import java.util.*;
class ArrayListDemo {

	public static void main(String[]args) {
	
		ArrayList al = new ArrayList();
		//add();
		al.add(10);
		al.add(20);
		al.add(20.5f);
		al.add(10);
		al.add("Aditya");
		al.add(20.5f);

		System.out.println(al);

		//int size();
		System.out.println(al.size());

		//Boolean Contains(java.lang.object);
		System.out.println(al.contains("Shashi_sir"));
		System.out.println(al.contains("Aditya"));

		// int indexOf(object);
		System.out.println(al.indexOf(20.5f));

		// int lastIndexOf(object);
		System.out.println(al.lastIndexOf(20.5f));

		// E get(int);
		System.out.println(al.get(3));

		// E set(int , E);
		System.out.println(al.set(4 , "kaldhone"));

		//void add(int E);
		al.add(5,"Manish");
		System.out.println(al);

		// E remove(int);
		System.out.println(al.remove(5));

		//addAll(Collection);
		ArrayList al2 = new ArrayList();
		al2.add("salman");
		al2.add("shahrukh");
		al2.add("Amir");
		al.addAll(al2);
		System.out.println(al);

		//java.lang.object[] toArray();
		Object arr[] = al.toArray();
		
		for(Object data : arr){
		
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
