/* Method : public int compareToIgnoreCase(String Str);
 * parameter : String
 * returnType : Integer
 * */
class CompareToIgnoreCase{

	public static void main(String[]args){
	
		String str1 = "SHASHI";
		String str2 = "shashi";
		String str3 = "shashikant";
		System.out.println(str1.compareToIgnoreCase(str2));//0
		System.out.println(str1.compareToIgnoreCase(str3));
	}

}
