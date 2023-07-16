import java.io.*;
class Demo{
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int data = 0;
		try{
		data = Integer.parseInt(br.readLine());
		}catch(IOException obj){
			System.out.println("IOException occured");
		}catch(NumberFormatException obj){
			System.out.println("Please Enter Integer");
			data = Integer.parseInt(br.readLine());
		}
		System.out.println(data);
	
	}
}
