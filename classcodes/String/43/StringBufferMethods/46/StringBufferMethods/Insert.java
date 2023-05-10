/* public Synchronized StringBuffer insert(int offset,String str);
 * parameters: integer,String
 * return type: StringBuffer
 */
class Insert{

	public static void main(String[]args){
	
		StringBuffer sb = new StringBuffer("Adityakaldhone");
		System.out.println(sb);//Adityakaldhone
		sb.insert(6,"@");
		System.out.println(sb); // Aditya@kaldhone

	}
}
