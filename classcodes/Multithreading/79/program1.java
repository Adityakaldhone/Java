//sleep and setName method

class MyThread extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread());
		
		Thread.currentThread().setName("Aditya");
		
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo {

	public static void main(String[]args) throws InterruptedException{
	
		System.out.println("start main ");		
		
		MyThread obj = new MyThread();
		obj.start();

		Thread.sleep(1000);
		
		System.out.println("End main ");		
	}
}
