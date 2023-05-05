class StringiBufferCapacityDemo{

	public static void main(String[]args){
			  
		StringBuffer str = new StringBuffer(""); 
		System.out.println(str.capacity()); 
		
		StringBuffer str1 = new StringBuffer("Aditya@11"); //16+9 = 25
		
		System.out.println(str1.capacity());
		str1.append("AdityaJitendraKaldhone"); //25*2+2 = 52
		
		System.out.println(str1);
		System.out.println(str1.capacity());

	}
}
