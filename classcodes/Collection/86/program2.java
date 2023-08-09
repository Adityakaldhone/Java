import java.util.*;

class VectorMethods {

	public static void main(String[]args) {
	
		Vector v = new Vector();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);

		System.out.println(v);

		v.insertElementAt(25,2);

		System.out.println(v);

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(2));
	}

}
