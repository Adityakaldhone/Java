/************** Priority of threads ***************/
class MyThread extends Thread {

	public void run() {
	
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getPriority());
	}
}
class ThreadDemo {

	public static void main(String[]args) {
	
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		
		MyThread obj1 = new MyThread();
		obj1.start();
		
		obj1.start();
	}

}
/*
output:
5
Exception in thread "main" Thread[Thread-0,5,main]
java.lang.IllegalThreadStateException
5
        at java.base/java.lang.Thread.start(Thread.java:793)
        at ThreadDemo.main(program6.java:21)
 */
