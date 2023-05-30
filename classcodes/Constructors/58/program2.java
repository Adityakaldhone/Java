//-----------------------------------------Inheritance-------------------------------//


class ICC{

	ICC(){
	
		System.out.println("In ICC constructor");
	}
}
class BCCI extends ICC{

	BCCI(){
	
		System.out.println("In BCCI constructor");
	}
}
class IPL extends BCCI{

	IPL(){
	
		System.out.println("In IPL constructor");
	}
}
class Client {

	public static void main(String[]args){
	
		IPL obj = new IPL();
	}
}
