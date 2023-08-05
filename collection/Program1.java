import java.util.*;

class ArrayListDemo extends ArrayList{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5f);	
		al.add("Shubham");	
		al.add(10);	
		al.add(20.5f);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Shubham"));
		System.out.println(al.indexOf(20.5f));
		System.out.println(al.get(2));
		System.out.println(al.set(2 , "Saish"));
		System.out.println(al);
		al.add(2,"Shubham");
		System.out.println(al);
		System.out.println(al.remove("Shubham"));
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add("anshu");
		al2.add("aryan");
		al2.add("swara");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println(al);
		al.addAll(3,al2);
		System.out.println(al);
	//	al.removeRange(3,6);
		System.out.println(al);
		
		Object[] arr = al.toArray();
		for(Object data : arr){
			System.out.print(data);
			System.out.print(" ");
		}
		System.out.println();
	//	al.clear();
		System.out.println(al);

		ArrayListDemo al3 = new ArrayListDemo(); 
		Object al4 = al.clone();
		System.out.println(al4);	
		System.out.println("al4 : "+ al4);
		System.out.println(al4.hashCode());
		System.out.println(al3.isEmpty());
}
}
