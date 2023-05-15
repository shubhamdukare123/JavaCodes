class ConstructorDemo{
	ConstructorDemo(){
		System.out.println("In Constructor");
	}

	void fun(){
		ConstructorDemo obj = new ConstructorDemo();
	}
	public static void main(String[] args){

		ConstructorDemo obj1 = new ConstructorDemo(); //In Constructor
		ConstructorDemo obj2 = new ConstructorDemo(); //In  Constructor

		obj1.fun(); // In constructor
	
	
	}

}
