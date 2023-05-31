class Parent {

       Parent(){
	
		System.out.println("In parent constructor");
	}
}
class Child extends Parent {

	Child() {
	
		System.out.println("In child Constructor");
	}
}

class Client {

	public static void main(String[]args){
	
		Parent obj1 = new Child();                 //Internal call : child(obj)
		
		Parent obj2 = new Parent();

		Child obj3 = new Child();
	}

}

/*
 For referance:

 Compiled from "program2.java"
class Client {
  Client();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #7                  // class Child
       3: dup
       4: invokespecial #9                  // Method Child."<init>":()V
       7: astore_1
       8: new           #10                 // class Parent
      11: dup
      12: invokespecial #12                 // Method Parent."<init>":()V
      15: astore_2
      16: new           #7                  // class Child
      19: dup
      20: invokespecial #9                  // Method Child."<init>":()V
      23: astore_3
      24: return
}
 */
