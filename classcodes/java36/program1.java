/* Integer cache (Autoboxing) */
class IntegerCache{

	public static void main(String[]args){
		//Integer b = new Integer(10);	from java5 ownwards there is warning for creating object of integer
		//Float b = new Float(10); 
		Boolean b = new Boolean(true); 
		int x = 10;
		int y = 10;
		Integer z = 10;
		int a = 20;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
