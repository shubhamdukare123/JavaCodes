class Parent{
	void m1(){
		System.out.println("m1");
	}
}
class Child extends Parent{
	@Override
	void m1(){
		System.out.println("In child m1");
	}	
}	

class Client{
	public static void main(String[] args){
		Child c = new Child();
		c.m1();
	}
}
