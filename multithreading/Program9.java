class MyThread implements Runnable{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj);
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}
