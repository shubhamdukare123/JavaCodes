class Core2web{
	int noOfCourses = 8;
	String favCourse = "Java";

	void disp(){
	
		System.out.println(noOfCourses);
		System.out.println(favCourse);
	
	}


}
class User{
	public static void main(String[] args){
		Core2web obj = new Core2web();
		System.out.println(obj.noOfCourses);
		System.out.println(obj.favCourse);

		obj.disp();
	}

}
