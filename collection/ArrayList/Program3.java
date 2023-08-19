import java.util.*;
class LinkedListDemo{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.add(38);
		ll.add("Shubham");
		ll.add("NBN");
		System.out.println(ll);
		ll.addFirst("BHS");
		System.out.println(ll);
		ll.addLast("Pune");
		ll.add(0, "Be happy!");
		System.out.println(ll);
	}
}
