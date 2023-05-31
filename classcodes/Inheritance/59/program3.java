class ICC {

	ICC(){
		
		System.out.println(this);
		System.out.println("In ICC constructor");
	}
}
class BCCI extends ICC{

	BCCI(){
	
		System.out.println(this);
		System.out.println("In BCCI constructor");
	}
}

class IPL {

	public static void main(String[]args){
	
		BCCI obj = new BCCI();
		System.out.println(obj);
	}	
}
