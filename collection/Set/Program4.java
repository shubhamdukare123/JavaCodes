import java.util.*;
class HashSetDemo{
	public static void main(String[] args){
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
	}
}
