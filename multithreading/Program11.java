import java.util.concurrent.*;
class MyThread implements Runnable{
	int num;
	public void run(){
		System.out.prinntln(Thread.currentThread() + " Start thread: " + num);
		dailyTask();
		System.out.println(Thread.currentThread() + "End thread: " + num);
	}
	void dailyTask(){
		try{
			Thread.sleep(8000);
		}catch(InterruptedException ie){
		
		}
	}

}
class ThreadPoolDemo{
	public static void main(String[] args){
		ExecutorService ser = Executors.newFixedThreadPool();
		for(int i=1; i<=6 ; i++ ){
			MyThread obj = new myThread(i);
			ser.execute(obj);
		}
	}
}
