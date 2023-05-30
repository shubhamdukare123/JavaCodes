class Demo1{

 int x = 10;
 private int y = 20;
 static int z = 30;
  
 void disp(){
 System.out.println(x);
 System.out.println(y);
 System.out.println(z);
 }
}

class Client{
	public static void main(String[] args){
		Demo1 obj1 = new Demo1();
		Demo1 obj2 = new Demo1();

		obj1.disp();// 10 20 30	
		obj2.disp();// 10 20 30
		System.out.println("----------");
		obj1.x = 100;
		obj2.x = 200;
		obj1.z = 300;
		obj1.disp();	//100 20 300
		obj2.disp();	//200 20 30
		System.out.println(Demo1.z);
		



	}
}
