class Demo{
	public static void main(String[] args){
		try{
		System.out.println(10/0);
		}catch(ArithmeticException obj){
			System.out.println("/ by 0 Excetion Occured");
		}finally{
			System.out.println("Connectin closed & finally block executed");
		}

	}
}
