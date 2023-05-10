class SBDemo{

	public static void main(String[]args){
	
		String str1 = "Aditya";
		String str2 = new String("kaldhone");
		StringBuffer str3 = new StringBuffer("Zeal");

		StringBuffer str4 = str3.append(str1);
		System.out.println(str4);

	}
}
