
class Demo1{

	void fun(int x){
	
		System.out.println("In fun");
	}
	public static void main(Stings[]args){
	
	
		Demo1 obj = new Demo1();
		obj.fun(10);
		obj.fun(10.5f);
	}
}
/* error: incompatible types: possible lossy conversion from float to int
                obj.fun(10.5f);
                        ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output*/
