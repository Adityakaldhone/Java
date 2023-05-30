class player{

	private int jerNo = 0;
	private String name = null;

	player(int jerNo,String name){
	
		this.jerNo = jerNo;
		this.name = name;
	}

	void info(){
	
		System.out.println(jerNo + " = "+name);
	}
}
class Client {

	public static void main(String[]args){
	
		player obj1 = new player(7,"MSDhoni");           //player(obj1)
		obj1.info();
		
		player obj2 = new player(18,"Virat");           //player(obj2)
		obj2.info();
		
		player obj3 = new player(8,"Jaddu");           //player(obj3)
		obj3.info();
	}
}
