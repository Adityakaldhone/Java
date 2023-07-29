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
		
		obj.join(1); //nano second
		
		for(int i=0;i<200;i++) {
		
			System.out.println(" main Thread ");
		}
		
		System.out.println(" End main ");
	}
}
