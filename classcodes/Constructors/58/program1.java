class player{

	private int jerNo = 0;
	private String name = null;

	player(){
	
/*		this.jerNo = jerNo;
		this.name = name;*/
	}

	void info(){
	
		System.out.println(jerNo + " = "+name);
	}
}
class Client {

	public static void main(String[]args){
	
		player obj1 = new player();           //player(obj1)
		obj1.info();
		
		player obj2 = new player();           //player(obj2)
		obj2.info();
		
		player obj3 = new player();           //player(obj3)
		obj3.info();
	}
}
