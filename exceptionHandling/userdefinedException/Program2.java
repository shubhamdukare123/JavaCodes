import java.util.Scanner;
class WrongQuestionException extends RuntimeException{
	WrongQuestionException(String msg){
		super(msg);
	}
}
class Exam{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Exam Started");
		System.out.println("if Question is wrong enter yes");
		String str = sc.nextLine();
		if (str.equals("yes"))
			  throw new WrongQuestionException("Grace marks will be given");
		System.out.println("End Exam");
	}
}
