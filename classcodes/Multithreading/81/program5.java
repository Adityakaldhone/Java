// Cached ThreadPool
import java.util.concurrent.*;
class MyThread implements Runnable {

	int num;
	MyThread(int num){
	
		this.num = num;
	}
	public void run() {
		Thread t = Thread.currentThread();
		t.setPriority(7);
		System.out.println(Thread.currentThread() + " Start Thread :"+num);
		DailyTask();
		System.out.println(Thread.currentThread() + " End Thread :"+num);
	}
	void DailyTask() {
		try{

			Thread.sleep(5000);
		}catch(InterruptedException ie){
		
		}
	}
}
class ThreadDemo {

	public static void main(String[]args) {
		
		System.out.println("main thread : "+ Thread.currentThread());
		ExecutorService ser = Executors.newCachedThreadPool();
		
			
		for(int i=0;i<10;i++) {
		
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
