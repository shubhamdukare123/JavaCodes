import java.util.*;
class SortedSetDemo{
	public static void main(String[] args){
		TreeSet ss = new TreeSet();

		ss.add("Himanshu");
		ss.add("Swapnil");
		ss.add("Rohit");
		ss.add("Shivam");
		ss.add("Prashant");
		ss.add("Akshay");

		System.out.println(ss);
		System.out.println(ss.tailSet("Rohit"));
		System.out.println(ss.headSet("Rohit"));
		System.out.println(ss.subSet("Akshay","Prashant"));


	}
	
}
