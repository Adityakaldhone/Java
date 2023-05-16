class States{
	double Population = 1422780000.0;
	static int noOfDist = 36;
	static String Sname = "Maharashtra";
	double Budget = 9800000000000000.0;
	
	static void StateInfo(){
		
		States obj = new States();
		System.out.println("Population = "+obj.Population);
		System.out.println("Statename = "+Sname);
		System.out.println("Number of Districts = "+noOfDist);
	}
	
	void Stategrowth(){

		float LitracyRate = 99.99f;
		float GDP = 9.0f;
		double Budget = 9800000000000000.0;
		
		States obj = new States();

		System.out.println("Budget = "+obj.Budget);
		System.out.println("GDP rate = "+GDP);
		System.out.println("Litracy Rate = "+LitracyRate);

	}
	
	public static void main(String[]args){
		StateInfo();
		States obj = new States();
		obj.Stategrowth();



	}
}
