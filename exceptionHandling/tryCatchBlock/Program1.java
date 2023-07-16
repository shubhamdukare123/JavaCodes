import java.io.*;
class Demo{

	void getData(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data = 0;
		try{
			 data = Integer.parseInt(br.readLine());
		}catch(IOException obj){
			System.out.println("IO Exception occured");
		}catch(NumberFormatException obj){
			System.out.println("NumberFormatException occured");
		}
		System.out.println(data);
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.getData();
	}

}
