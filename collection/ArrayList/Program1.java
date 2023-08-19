import java.util.*;
class ArrayListDemo extends ArrayList{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5f);
		al.add("Shubham");
		al.add(10);
		al.add(20.5f);
		al.add(10);
		System.out.println(al);
		//size() 
		System.out.println(al.size());
		//contains()
		System.out.println(al.contains("Shubham"));
		//indexOf()
		System.out.println(al.indexOf(10.5f));
		//lastIndexOf
		System.out.println(al.lastIndexOf(10));
		//get()
		System.out.println(al.get(2));
		//set()
		System.out.println(al.set(2,"Saish"));
		System.out.println(al);
		//add()
		al.add(3,"Shubham");
		al.add(4,"Shubhzzz");
		System.out.println(al);
		//remove(E)
		System.out.println(al.remove("Shubhzzz"));
		System.out.println(al);
		//remove(int)
		System.out.println(al.remove(2));
		System.out.println(al.remove(2));
		System.out.println(al);
		//Adding new collection
		ArrayList al2 = new ArrayList();
		al2.add("Vaishu");
		al2.add("Saish");
		al2.add("Shubham");
		System.out.println(al2);
		System.out.println(al.addAll(al2));
		System.out.println(al);
		al.addAll(0, al2);
		System.out.println(al);
		// protected void removeRange();
		ArrayListDemo obj = new ArrayListDemo();
	//	obj.removeRange(0,3);
	//	System.out.println(al);
		Object arr[] = al.toArray();
		for(Object data : arr){
			System.out.println(data);
		}
	}
}
