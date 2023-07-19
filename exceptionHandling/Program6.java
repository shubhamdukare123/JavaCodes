import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		try{
			if(x==0)
				throw new ArithmeticException("Mitra 0 nako taku");
		}catch(ArithmeticException obj){
			System.out.println("Exception in thread" + " " + Thread.currentThread().getName());
			obj.printStackTrace();
			

		}
	}
}
