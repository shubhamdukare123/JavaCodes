class AmbiguityDemo{

	void fun(int x, float f ){
		System.out.println("In fun 1");
	
	}
	void fun(float x , int f){
		System.out.println("In fun 2");
	}
	public static void main(String[] args){
		int x = 10;
		float y = 20;
		Demo obj = new Demo();
		//Ambiguity Problem here;
	       obj. fun(x,y);	
		


	}

}
