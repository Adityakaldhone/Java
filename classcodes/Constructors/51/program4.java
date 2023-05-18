class Bank{

	static String BankName = "State Bank Of India";
	int accountNumber = 23451233;

	void Info(){
	
		System.out.println("BankName = "+ BankName);
		System.out.println("Account Number =  "+accountNumber);
	}
}
class MainDemo{

	public static void main(String[]args){
		
		Bank obj1 = new Bank();
		Bank obj2 = new Bank();
		
		obj1.Info();
		obj2.Info();
		
		obj2.BankName = "Bank Of Maharashtra";
		obj2.accountNumber = 34532453;
		
		System.out.println("----------");
		
		obj1.Info();
		obj2.Info();
	}
}
