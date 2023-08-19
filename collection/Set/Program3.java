import java.util.*;
class Branches{
	int serNo = 0;
	String clgName = null;
	Branches(int serNo, String clgName){
		this.serNo = serNo;
		this.clgName = clgName;
	}
	public String toString(){
		return serNo +"."+ clgName;
	}
}
class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Branches(1,"CS"));
		lhs.add(new Branches(2,"IT"));
		lhs.add(new Branches(3,"Mech"));
		lhs.add(new Branches(4,"Civil"));
		System.out.println(lhs);
	}
}
