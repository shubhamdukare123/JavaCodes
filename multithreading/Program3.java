class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");
		}
	}

}
class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();
		
		Thread.sleep(2000);
		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	
	}
}
