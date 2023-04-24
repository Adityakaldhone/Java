class ArgumentDemo{
	int fun(int x){	
		int val = x+50;
		return val;
	}
	public static void main(String[]args){
		ArgumentDemo obj = new ArgumentDemo();	
		int ret = obj.fun(10);
		System.out.println(ret);
	}
}
