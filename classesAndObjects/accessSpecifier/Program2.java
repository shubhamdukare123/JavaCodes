class Core2webPrivate{
	int numOfCourses = 8;
        private String favCourse = "java";
	
	void disp(){
		System.out.println(numOfCourses);
		System.out.println(favCourse);
	}

}
class Student {
	public static void main(String[] args){
		Core2webPrivate obj = new Core2webPrivate();
		
		System.out.println(obj.numOfCourses);
		//System.out.println(obj.favCourse);
		obj.disp();
	}

}
