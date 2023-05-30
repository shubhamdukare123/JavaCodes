class MultipleStaticBlocks{
	int x = 10;
	static int y = 20;

	static {
		System.out.println("Static Block 1");

	}
	public static void main(String[] args){
		System.out.println("In Main Method ");
		MultipleStaticBlocks obj = new MultipleStaticBlocks();
		System.out.println(obj.x);
	}

		static{
			System.out.println("Static Block 2");
		}

}
