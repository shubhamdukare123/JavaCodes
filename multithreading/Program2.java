class  MyThread1 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0 ; i<5 ; i++)
			System.out.println("In Thread1");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException obj){
				System.out.println("Exception handled");
			}
	}
}

class MyThread2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5 ; i++){
			System.out.println("In Thread2");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException obj){
				System.out.println("Exception handled");
			}
		}
	}
}

class MyThread{
	public static void main(String[] args) throws InterruptedException{
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<5 ; i++){
			System.out.println("In main");
			Thread.sleep(2000);
		}
	}
}
