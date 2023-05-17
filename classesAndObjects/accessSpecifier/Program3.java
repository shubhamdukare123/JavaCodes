class Mobile{
	int ram = 4;
	String brand = "MI";

	void whatsapp(){
		System.out.println("MyChats");

	
	}

}
class myGadgets{
	public static void main(String[] args){
		Mobile obj = new Mobile();
		System.out.println(obj.ram);
		System.out.println(obj.brand);

		obj.whatsapp();
	
	
	}
	

}
