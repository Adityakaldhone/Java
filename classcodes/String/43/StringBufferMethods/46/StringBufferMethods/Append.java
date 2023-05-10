/* Method : public synchronized StringBuffer append(StringBuffer);
 * parameters:String
 * returntype : StringBuffer*/

class AppendDemo{

	public static void main(String[]args){
	
		StringBuffer sb1 = new StringBuffer("Aditya");
		StringBuffer sb2 = new StringBuffer("Kaldhone");

		System.out.println(sb1.append(sb2));  //AdoityaKaldhone
		
	}
}

