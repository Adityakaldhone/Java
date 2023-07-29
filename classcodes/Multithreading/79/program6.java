class MyThread extends Thread { 
	
	public void run() {
		
		for(int i=0;i<1000;i++) {
		
			System.out.println(" Thread-0 ");
		}

	}
}
class ThreadDemo {

	public static void main(String[]args) throws InterruptedException {
		
		ThreadDemo obj1 = new ThreadDemo();
		MyThread obj = new MyThread();
		
		obj.start();
		
		obj.yield();
		
		for(int i=0;i<200;i++) {
		
			System.out.println(" main Thread ");
		}
		
		System.out.println(" End main ");
	}
}

/*
output:
root@LAPTOP-382C9LGN:~/Java/Java/classcodes/Multithreading/79# java ThreadDemo
 Thread-0
Exception in thread "main"  Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
java.lang.IllegalThreadStateException
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
 Thread-0
        at java.base/java.lang.Thread.start(Thread.java:793)
 */
