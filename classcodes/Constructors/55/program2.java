class Demo{

	static int x = 10;

	static {
	
		static int y = 20;
	}

	void fun(){
	
		static int z = 20;
	}

	static void gun(){
	
		static int z = 10;
	}
}

//error:
/*
 *we cannot initialize static variables into the blocks
 * program2.java:7: error: illegal start of expression
                static int y = 20;
                ^
program2.java:10: error: class, interface, enum, or record expected
        void fun(){
        ^
program2.java:13: error: class, interface, enum, or record expected
        }
        ^
program2.java:18: error: class, interface, enum, or record expected
        }
        ^
4 errors*/
