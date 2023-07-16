import java.io.*;
class Demo{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data = 0;
		try{
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
			System.out.println("NumberFormatException handled by NumberFormatException class");
		}catch(IllegalArgumentException obj){
			System.out.println("NumberFormatException handled by IllegalFormatException class");
		}catch(RuntimeException obj){
			System.out.println("NumberFormatException handled by RuntimeException class");
		}catch(Exception obj){
			System.out.println("NumberFormatException handled by Exception class");
		}catch(Throwable obj){
			System.out.println("NumberFormatException handled by Throwable class");
		}
	}


}
