//parent ThreadGroup and child ThreadGroup and their Threads
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

		ThreadGroup cThreadGp = new ThreadGroup(pThreadGp , "Incubator");
		
		MyThread obj4 = new MyThread(cThreadGp , " flutter ");
		MyThread obj5 = new MyThread(cThreadGp , " Springboot ");
		MyThread obj6 = new MyThread(cThreadGp , " reactjs ");
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
	}
}
