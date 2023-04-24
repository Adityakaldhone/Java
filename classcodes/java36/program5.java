class ArgumentDemo{
	void fun(){	
		System.out.println();
	}
	public static void main(String[]args){
	
		fun(10);
	}
}
/* error:  error: method fun in class ArgumentDemo cannot be applied to given types;
                fun(10);
                ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in lengt
  */h
