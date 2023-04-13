/* Given the temprature of a person in farenheit print whether the person has high,normal,low temprature
 * >98.6 ==>high
 * 98.0<= and <= 98.6 ==>normal
 * <98   ==>low
 */
class Temprature{

	public static void main(String [] args){
	
		float temp = 98.4f;
		if(temp>98.6f){
		
			System.out.println("High");
		}else if(temp>= 98.0f && temp<= 98.6f){
		
			System.out.println("Normal");
		}else{
		
		
			System.out.println("Low");
		}
	}
}
