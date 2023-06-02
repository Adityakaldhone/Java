class StringDemo{

	public static void main(String[]args){
	
		String str1 = "Core2Web";// in Heap(String Constant Pool)
		String str2 = new String("Core2Web"); // Heap
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "Core2Web"; // String constant pool
		String str4 = new String("Core2Web");//Heap
		

		String str5 = "Shashi";

		System.out.println(str5);
		
		System.out.println("identity hashcode of str5 = " +System.identityHashCode(str5));

		str5 = "bagal";

		System.out.println(str5);
		System.out.println("identity hashcode of str5 after assigning = " +System.identityHashCode(str5));
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
