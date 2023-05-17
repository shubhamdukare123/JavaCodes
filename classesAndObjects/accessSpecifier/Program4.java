class MacD{
	int items = 4;
	String product = "Fries";
	private int dailyRevenue = 30000;
	void menu(){
	String menu1 = "Veg";
	String menu2 = "Non-veg";
	}

}
class Customer{
	public static void main(String[] args){
		MacD obj = new MacD();
		System.out.println(obj.items);
		System.out.println(obj.product);
		obj.menu();
	}
}
