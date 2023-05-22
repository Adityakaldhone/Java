//-----------------------------Static block Introduction-----------------------------//
//getstatic:prints the string
//ldc: load the string
class Demo{

	static {
	
		System.out.println("Static block");
	}
	public static void main(String[]args){
	
		System.out.println("main method");
	}
}
//For reference:
/*Compiled from "program1.java"
class Demo {
  Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #13                 // String main method
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return

  static {};
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #21                 // String Static block
       5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: return
}*/
