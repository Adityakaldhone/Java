class Demo{
	
	int x = 10;
	static int y = 20;
	
	static {
	
		System.out.println("Static block1");
	}

	public static void main(String[]args){
	
		System.out.println("main method");
		Demo obj = new Demo();

		System.out.println(obj.x);
	}
	static {
	
		System.out.println("Static block2");
		System.out.println(y);
	}
}

/*
output:
static block 1
static block 2
20
main method
10
*/


//For referance:
/*Compiled from "program2.java"
class Demo {
  int x;

  static int y;

  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #19                 // String main method
       5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: new           #8                  // class Demo
      11: dup
      12: invokespecial #27                 // Method "<init>":()V
      15: astore_1
      16: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      19: aload_1
      20: getfield      #7                  // Field x:I
      23: invokevirtual #28                 // Method java/io/PrintStream.println:(I)V
      26: return

  static {};
    Code:
       0: bipush        20
       2: putstatic     #31                 // Field y:I
       5: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       8: ldc           #34                 // String Static block1
      10: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      13: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      16: ldc           #36                 // String Static block2
      18: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      21: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      24: getstatic     #31                 // Field y:I
      27: invokevirtual #28                 // Method java/io/PrintStream.println:(I)V
      30: return
}*/
