class AccessClass{
	static int x = 10;
	static int y = 20;
	static void disp(){
		System.out.println(x);
		System.out.println(y);
	}

}
class User{
	public static void main(String[] args){
		System.out.println(AccessClass.x);
		System.out.println(AccessClass.y);
		AccessClass.disp();
	
	
	}

}
