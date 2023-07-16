class Demo{
	
	void m1(){
		try{
		System.out.println(10/0); //risky code
		}catch(ArithmeticException obj){
		 	System.out.println("Divide by zero Exception");
			obj.printStackTrace();
		}
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.m1();

	}
}
