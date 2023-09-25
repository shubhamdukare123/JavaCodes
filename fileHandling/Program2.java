import java.io.*;
class FileMethodsDemo{
	public static void main(String[] args)throws IOException{

		File nobj = new File("shubham.txt");
		nobj.createNewFile();
		//File nobj = new File("FileHandLing", "Code2");
		
		System.out.println(nobj.getName());
		System.out.println(nobj.getParent());// FileHandling
		System.out.println(nobj.getPath());
		System.out.println(nobj.getAbsolutePath());
		System.out.println(nobj.canRead()); //true
		System.out.println(nobj.canWrite()); //true
		System.out.println(nobj.isDirectory()); //false
		System.out.println(nobj.isFile()); //true
		System.out.println(nobj.lastModified()); //time
		System.out.println(nobj.list()); 

	}
}
