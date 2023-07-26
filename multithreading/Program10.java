class MyThread extends Thread{
	public void run(){
	
	//	System.out.println(getPriority());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		System.out.println(t1.getPriority());
		t1.setPriority(7);
		System.out.println(t1.getPriority());
		t1.start();
		try{
		t1.start();
		}catch(IllegalThreadStateException obj){
			System.out.println("Exception caught");
		}

	}
}
