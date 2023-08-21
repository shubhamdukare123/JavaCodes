import java.util.*;
class PropertiesDemo{
	public static void main(String[] args){
		Properties obj = new Properties();
		fileInputStream fobj = new fileInputStreaam("friends.properties");
		obj.load(fobj);
		String name = obj.getProperty("Ashish");
		System.out.println(name);
		obj.setProperty("Shashi","Biencaps");
		FileOutputStream outObj = new FileOutputStream("friends.properties");
		obj.store(outObj, "Updated by Shubham");		

	}
}
