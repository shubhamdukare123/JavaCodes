import java.io.*;

class Demo{

	void getData()throws IOException{
		System.out.println("In getData");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);
	}
	public static void main(String[] args)throws IOException{
		Demo obj = new Demo();
		obj.getData();
	
	}

}
