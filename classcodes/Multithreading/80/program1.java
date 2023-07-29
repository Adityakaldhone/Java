// Thread Group
class MyThread extends Thread {
	
	public void run() {
	
		System.out.println(Thread.currentThread().getName());

		for(int i=0;i<100;i++) {
		
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class ThreadDemo {

	public static void main(String[]args) throws InterruptedException {
	
		MyThread obj = new MyThread();
		obj.start();
		
		Thread.sleep(1);
		obj.setName("Varun");
	}
}
