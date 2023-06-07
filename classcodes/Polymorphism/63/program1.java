class IPL {

	void matchInfo(String Team1,String Team2) {
	
		System.out.println(Team1 + " vs "+Team2);
	}
	void matchInfo(String Team1,String Team2,String venue) {
	
		System.out.println(Team1 + " vs "+Team2);
		System.out.println("venue = " +venue);
	}
}
class Client {

	public static void main(String[]args) {
	
		IPL ipl2023 = new IPL();

		ipl2023.matchInfo("GT","CSK");
		ipl2023.matchInfo("GT","CSK","NMSA");
	}
}

/*
output:
GT vs CSK
GT vs CSK
venue = NMSA
 */ 
