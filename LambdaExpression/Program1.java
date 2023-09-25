//It works only on functional interface
interface Core2web{
	void lang();
}
class Year2022{
	public static void main(String[] args){
		Core2web c2w = ()->{
			System.out.println("c2w");
		};
		c2w.lang();
	
	}
}
