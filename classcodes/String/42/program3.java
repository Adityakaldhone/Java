class StringDEmo{

	public static void main(String[]args){
	
		String str1 = "Kanha";
		String str2 = "Kanha";
		
		String str3 = new String("Kanha");
		String str4 = new String("Kanha");
		
		String str5 = "Rahul";
		
		String str6 = new String("Rahul");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}
