import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Shubham");
		al.add("Himanshu");
		al.add("Shivam");
		al.add("Prashant");
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			if("Shivam".equals(itr.next()))
				itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(al);
	}
}
