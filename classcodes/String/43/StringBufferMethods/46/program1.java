class StringBufferDemo{

	public static void main(String[]args){
	
		StringBuffer sb = new StringBuffer(100);
		sb.append("Biencaps");
		sb.append("Core2Web");
		System.out.println(sb);            // BiencapsCore2Web
		System.out.println(sb.capacity()); // 100
		sb.append("Incubator");
		System.out.println(sb);		   //BiencapsCorerWebIncubator
		System.out.println(sb.capacity()); //100

	}
}
