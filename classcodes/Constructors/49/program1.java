class Core2Web{

	int x = 10;
	Core2Web(){
	
		System.out.println("In Constructor");
	}
	public static void main(String[]args){
	
		System.out.println("In Main");
		Core2Web obj = new Core2Web();

	}
}
/*
 * Bytecode for referance:
 * class Core2Web {
  int x;

  Core2Web();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        10
       7: putfield      #7                  // Field x:I
      10: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      13: ldc           #19                 // String In Constructor
      15: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      18: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #27                 // String In Main
       5: invokevirtual #21                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: new           #8                  // class Core2Web
      11: dup
      12: invokespecial #29                 // Method "<init>":()V
      15: astore_1
      16: return
}
*/
