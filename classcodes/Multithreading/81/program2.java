class MyThread extends Thread {

	MyThread(ThreadGroup tg , String str) {
	
		super(tg , str);
	}
	public void run() {
	
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo {

	public static void main(String[]args) throws InterruptedException {
	
		ThreadGroup pThreadGP = new ThreadGroup("India");
		
		MyThread obj1 = new MyThread(pThreadGP , "Maha");
		MyThread obj2 = new MyThread(pThreadGP , "Goa");

		ThreadGroup cThreadGP1 = new ThreadGroup(pThreadGP , "Pakistan");

		MyThread obj3 = new MyThread(cThreadGP1 , "Lahore");
		MyThread obj4 = new MyThread(cThreadGP1 , "karachi");
		
		ThreadGroup cThreadGP2 = new ThreadGroup(pThreadGP , "Bangladesh");

		MyThread obj5 = new MyThread(cThreadGP2 , "Dhaka");
		MyThread obj6 = new MyThread(cThreadGP2 , "Barisal");

		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
		
		Thread.sleep(1);
		System.out.println("Active count of Threads in ThreadGroups : "+pThreadGP.activeCount());
		System.out.println("Active Group Count in pThreadGP : "+pThreadGP.activeGroupCount());


	}
}
