/* public Synchronized StringBuffer Delete(int start,int end);
 * parameters: integer
 * return type: StringBuffer
 */
class DeleteDemo{

	public static void main(String[]args){
	
		StringBuffer sb = new StringBuffer("Adityakaldhone");
		System.out.println(sb);//Adityakaldhone
		sb.delete(3,6);
		System.out.println(sb);//Adikaldhone

	}
}
