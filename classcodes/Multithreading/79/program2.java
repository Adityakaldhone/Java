class MyThread extends Thread { 
	
	public void run() {
		
		for(int i=0;i<10;i++) {
		
			System.out.println(" Thread-0 ");
		}
		try {

			join();
		}catch(InterruptedException ie) {
		

		}

	}
}
class ThreadDemo {

	public static void main(String[]args) throws InterruptedException {
		
		ThreadDemo obj1 = new ThreadDemo();
		MyThread obj = new MyThread();
		
		obj.start();

		obj.join();
		
		for(int i=0;i<10;i++) {
		
			System.out.println(" main Thread ");
		}
		System.out.println(" End main ");
	}
}
