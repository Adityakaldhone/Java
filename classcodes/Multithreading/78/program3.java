//(Part 2)
//Creating child thread using Runnable Interface
class MyThread implements Runnable {

	public void run() {
	
		System.out.println("MyThread = "+ Thread.currentThread().getName());
	}
}
class ThreadDemo {

	public static void main(String[]args) {
	
		System.out.println("Main = "+ Thread.currentThread().getName());
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
	}
}


