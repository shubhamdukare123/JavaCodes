import java.io.*;
class FileDemo{
	public static void main(String[] args){
		File fobj = new File("/home/shubham/javaCodes/fileHandling/");
			System.out.println(fobj.exists());
			String[] files = fobj.list();
			int countFile = 0;
			int countDir = 0;
			for(String str : files){
				File f = new File(str);
				if(f.isFile())
					countFile++;
				else 
					countDir++;
			} 
			System.out.println("No is Files : " + countFile );
			System.out.println("No is Directories : " + countDir );
	}
}
