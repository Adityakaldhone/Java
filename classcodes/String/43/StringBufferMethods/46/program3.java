class SBDemo{

	public static void main(String[]args){
	
		String str1 = "Aditya";
		String str2 = new String("kaldhone");
		StringBuffer str3 = new StringBuffer("Zeal");

		String str4 = str1.concat(str3);
		String str5 = str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(strs);

	}
}
/*
 * program3.java:9: error: incompatible types: StringBuffer cannot be converted to String
                String str4 = str1.concat(str3);
                                          ^
program3.java:10: error: incompatible types: StringBuffer cannot be converted to String
                String str5 = str3.append(str2);
                                         ^
program3.java:16: error: cannot find symbol
                System.out.println(strs);
                                   ^
  symbol:   variable strs
  location: class SBDemo
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output*/
