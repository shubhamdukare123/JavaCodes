import java.util.*;
class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(10);
		s.push("Shubham");
		s.push(15.5f);
		s.push(20.5);
		s.push('A');
		s.pop();
		System.out.println(s);
	}
}
