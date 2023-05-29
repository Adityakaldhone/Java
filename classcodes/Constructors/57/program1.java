class Demo{

	int x = 10;

	Demo(){
	
		System.out.println("In no args constructor");
	}
	Demo(){
	
		System.out.println("para constructor");
	}

}


/*error: because of method signature */
/* 
program1.java:9: error: constructor Demo() is already defined in class Demo
        Demo(){
        ^
1 error 
 */
