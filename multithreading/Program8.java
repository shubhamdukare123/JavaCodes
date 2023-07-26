class MyThread1 extends Thread{
	public void run(){
	
		System.out.println("MyThread1"+ Thread.currentThread().getName());
	}
}
class MyThread2 extends Thread{
	public void run(){
		System.out.println("MyThread2:"+ Thread.currentThread().getName());
		MyThread1 obj = new MyThread1();
		obj.start();
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread2 obj = new MyThread2();
		obj.start();
		System.out.println("ThreadDemo"+ Thread.currentThread().getName());
	}
}
