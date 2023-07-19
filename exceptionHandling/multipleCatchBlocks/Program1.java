import java.io.*;
class Demo{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		int x = Integer.parseInt(br.readLine());
		}catch(IOException | NumberFormatException obj ){
			System.out.println("Exception Occured");
			obj.printStackTrace();
			System.out.println(obj.getMessage());
			System.out.println(obj.toString());
		}
	}
}
