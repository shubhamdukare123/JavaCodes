import java.util.Scanner;
class DataUnderflowException extends RuntimeException{
	DataUnderflowException(String msg){
		super(msg);
	}
}
class DataOverflowException extends RuntimeException{
	DataOverflowException(String msg){
		super(msg);
	}
}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter elements :");
		System.out.println("Note : 0 < element < 100 ");
	       	for(int i=0; i<arr.length ; i++){
			int data = sc.nextInt();
			if(data<0)
				throw new DataUnderflowException("Arey 0 peksha greater tak");
			if(data>100)
				throw new DataOverflowException("Arey 100 peksha choti value tak");
			arr[i] = data;
		}	
		for(int i=0 ; i<arr.length ; i++)
			System.out.println(arr[i]);
		
	}
}
