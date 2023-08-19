import java.util.*;
class Fort{
	int serNo = 0;
	String fortName = null;
	Fort(int serNo, String fortName){
		this.serNo = serNo;
		this.fortName = fortName;
	}
	public String toString(){
		return serNo + "." + fortName;
	}
}
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(new Fort(1,"RajGad"));
		al.add(new Fort(2,"RaiGad"));
		al.add(new Fort(3,"Purandar"));
		al.add(new Fort(4,"Sinhgad"));
		System.out.println(al);
		al.add(0,"Shivneri");		
		System.out.println(al);
		
	}
}
