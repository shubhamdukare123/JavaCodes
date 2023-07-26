class MyThread extends Thread{
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("In run");
			try{
			MyThread.sleep(2000);
			}catch(InterruptedException obj){
			
			}
		}
	}

}
class ThreadDemo{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		MyThread obj = new MyThread();
		obj.start();
		for(int i=0; i<=10; i++)
			System.out.println("In main");
	}
}
