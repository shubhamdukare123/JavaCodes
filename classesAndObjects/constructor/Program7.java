class UseThis{
	int x = 10;
	UseThis(){
		System.out.println("In no-args Constructor");
	}
	UseThis(int x ){
		this();
		System.out.println("In para Constructor");
	
	}
	public static void main(String[] args){
		UseThis obj = new UseThis(10);
	
	}
}
