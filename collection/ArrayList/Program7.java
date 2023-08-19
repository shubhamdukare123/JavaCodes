import java.util.*;
class CursorDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("NBN");

		for(var x : al){
			System.out.println(x.getClass().getName());
		}
		//iterator
		Iterator cursor = al.iterator();
		while(cursor.hasNext()){
			if ("NBN".equals(cursor.next()))
				cursor.remove();
		}
		System.out.println(al);
		ListIterator litr = al.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		while(litr.hasPrevious())
			System.out.println(litr.previous());
	
	}
}
