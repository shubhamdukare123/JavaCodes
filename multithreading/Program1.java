class MyThread extends Thread{
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("In run");
			try{
			Thread.sleep(2000);
			}catch(InterruptedException obj){
				System.out.println("Exception handled");
			}
		}
	}
}
class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();
		for(int i=0; i<5; i++){
			System.out.println("In main");
			Thread.sleep(2000);
		}
	}
}
