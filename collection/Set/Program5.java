import java.util.*;
class NavigableSetDemo{
	public static void main(String[] args){
		NavigableSet ns = new TreeSet();
		ns.add("Shubham");
		ns.add("Himanshu");
		ns.add("Vipul");
		ns.add("Manish");
		ns.add("Aniruddha");
		System.out.println(ns);
		System.out.println(ns.lower("Manish"));
		System.out.println(ns.floor("Manish"));
		System.out.println(ns.higher("Aniruddha"));
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		System.out.println(ns.descendingSet());
		System.out.println(ns);
		System.out.println(ns.pollFirst());
		System.out.println(ns);
	}
}
