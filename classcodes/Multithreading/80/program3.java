//ThreadGroup and their threads
class MyThread extends Thread {

	MyThread(ThreadGroup tg , String str){
	
		super(tg , str);
	}
	
	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo {

	public static void main(String[]args) {
	
		ThreadGroup pThreadGp = new ThreadGroup("Core2web");

		MyThread obj1 = new MyThread(pThreadGp , " C ");
		MyThread obj2 = new MyThread(pThreadGp , " java ");
		MyThread obj3 = new MyThread(pThreadGp , " python ");
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
