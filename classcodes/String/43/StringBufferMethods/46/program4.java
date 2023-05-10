class SBDemo{

	public static void main(String[]args){
	
		String str1 = "Aditya";
		String str2 = new String("kaldhone");
		StringBuffer str3 = new StringBuffer("Zeal");

		str1.concat(str2);                         //Adityakaldhone
		str3.append(str2);                         //Adityakaldhone

		System.out.println(str1);                  //Aditya
		System.out.println(str2);                  //kaldhone
		System.out.println(str3);		   //Zealkaldhone

	}
}
