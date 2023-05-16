class Crickplayer{
	
	int JerNo = 18;
	static String Pname = "Virat";
	static float salary = 290000000.0f;
	
	static void PlayerInfo(){
		
		Crickplayer obj = new Crickplayer();
		System.out.println(obj.JerNo);
		System.out.println(Pname);
	}
	
	void Playerperformance(){

		float avg = 50.00f;
		int NoOfMatchesPlayed = 90;

		Crickplayer obj = new Crickplayer();
		
		System.out.println(obj.salary);
		System.out.println(avg);
		System.out.println(NoOfMatchesPlayed);

	}
	
	public static void main(String[]args){
		PlayerInfo();
		Crickplayer obj = new Crickplayer();
		obj.Playerperformance();



	}
}
