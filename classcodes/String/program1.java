class StringDemo{

	public static void main(String[]args){
	
		String str1 = "Core2Web";// in Heap(String Constant Pool)
		String str2 = new String("Core2Web"); // Heap
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "Core2Web"; // String constant pool
		String str4 = new String("Core2Web");//Heap
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
