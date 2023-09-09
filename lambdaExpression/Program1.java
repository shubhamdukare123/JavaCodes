/*interface Core2web{
	void lang();
}*/

class Core2Web{

}

class Year2022{
	public static void main(String[] args){
		Core2Web c2w = new Core2Web(){
			void disp(){
			System.out.println("In anonymys inner-class");
			}
		};				
	}
}
