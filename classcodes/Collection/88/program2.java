//comparable
import java.util.*;
class Movies implements Comparable {

	String mName = null;
	float totColl = 0.0f;

	Movies(String mName , float totColl) {
	
		this.mName = mName;
		this.totColl = totColl;
	}

		public int compareTo(Object obj) {

			return mName.compareTo(((Movies)obj).mName);
		}
		public String toString() {
		
			return mName;
		}
	}

class TreeSetDemo {
	
	public static void main(String[]args) {
	
		TreeSet ts = new TreeSet();

		ts.add(new Movies("Gadar2" , 150.00f));
		ts.add(new Movies("Omg2" , 76.00f));
		ts.add(new Movies("Jailor" , 100.00f));
		ts.add(new Movies("ZealScam" , 170.00f));
		ts.add(new Movies("Intersetllar" , 156.00f));
		ts.add(new Movies("Omg2" , 120.00f));

		System.out.println(ts);
	}
}
