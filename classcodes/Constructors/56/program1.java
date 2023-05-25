class Demo{

	int x = 10;

	Demo(){                                             //Internal:Demo(Demo this)
		System.out.println(this);
		System.out.println("In constructor");
		System.out.println(x);
	}
	void fun(){					   //Internal:fun(Demo this)
	
		System.out.println(this);
		System.out.println(x);
	}
	public static void main(String[]args){
	
		Demo obj = new Demo();
		System.out.println(obj);
		obj.fun();				//fun(obj)
	}
}
