interface Core2Web{
	String lang(int numCourse);
}
class Year2022{
	public static void main(String[] args){
		Core2web c2w = (int xyz) -> "Java/Flutter/Python : " + xyz;
		System.out.println(c2w.lang(3));
	}
}
