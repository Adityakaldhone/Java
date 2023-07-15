// try with finally 

class FinallyDemo {

		void m1() {
		
		}
		void m2() {
		
		}
	        public static void main(String[]args) {

			FinallyDemo obj = new FinallyDemo();
			obj.m1();
			obj = null;

			try {
				
				obj.m2();
			
			}catch(ArithmeticException obj3){
			
				System.out.println("Here");
			
			}finally {
			
				System.out.println("Connection closed");
			}

	        } 
}
/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Exception_Handling/75# java FinallyDemo
Connection closed
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "FinallyDemo.m2()" because "<local1>" is null
        at FinallyDemo.main(program6.java:19)
 */
