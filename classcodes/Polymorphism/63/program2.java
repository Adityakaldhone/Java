//-----overriding(real time example)----//
class Match {

	void matchType() {
	
		System.out.println("T20/OneDay/Test");
	}
}
class IPL extends Match {

	void matchType() {
	
		System.out.println("T20");
	}
}
class Testmatch extends Match {

	void matchType() {
	
		System.out.println("Test");
	}
}
class Client {

	public static void main(String[]args){
	
		Match Type1 = new IPL();
		Type1.matchType();

		Testmatch Type2 = new Testmatch();
		Type2.matchType();

		Match obj = new Match();
		obj.matchType();
	}
}


/*
output:
T20
Test
T20/OneDay/Test
 */ 
