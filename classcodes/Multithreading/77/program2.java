class Mythread extends Thread {

	public void run() {
	
		for(int i=0;i<10;i++){
		
			System.out.println("In run");
			try {

			Thread.sleep(1000);
			}catch(InterruptedException obj){
			
			}
		}
	}
}
class ThreadDemo{

	public static void main(String[]args) throws InterruptedException {
	
		Mythread obj = new Mythread();
		obj.start();
		
		for(int i=0;i<10;i++){
		
			System.out.println("In Main");
			Thread.sleep(1000);
		}
	}
}
