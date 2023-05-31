class Parent{
	
	Parent(){                                            //invokespecial(call to constructor of parent class to access methods of parent cla								ss)           //internal call:Parent(this)

		System.out.println("In parent constructor");
	}

	void ParentProperty(){
	
		System.out.println("car,gold,farm");
	}
}
class Child extends Parent{
	
	Child(){						//invokespecial(call to the parent constructor that is Parent constructor)
								//  internal call :Child(this)
	
		System.out.println("In Child constructor");
	}
}
class Client {

	public static void main(String[]args){
	
		Child obj = new Child();           //internal call  Child(obj)
		obj.ParentProperty();
	}
}

/*
output:
In parent constructor
In Child constructor
car,gold,farm
 */
