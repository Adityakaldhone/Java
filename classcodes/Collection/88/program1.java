import java.util.*;

class TreeSetDemo {

	public static void main(String[]args) {
	
		TreeSet Ts = new TreeSet();

		Ts.add(new StringBuffer("Aditya"));
		Ts.add(new StringBuffer("Ganesh"));
		Ts.add(new StringBuffer("Dhiraj"));
		Ts.add(new StringBuffer("Manish"));
		Ts.add(new StringBuffer("Rohan"));
		Ts.add(new StringBuffer("Omkar"));
		Ts.add(new StringBuffer("Aditya"));
		Ts.add(new StringBuffer("Ajinkya"));

		System.out.println(Ts);
	}
}

