class HiddenThis{
	HiddenThis(){// HiddenThis(HiddenThis this)
		System.out.println("In no-args Constructor");
	}
	HiddenThis(int x){ // HiddenThis(HiddenThis this , int x)
		System.out.println("In para Constructor");
	}
	public static void main(String[] args){
		HiddenThis obj1 = new HiddenThis();
		HiddenThis obj2 = new HiddenThis(10);
	
	}
}
