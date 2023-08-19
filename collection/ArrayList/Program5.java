import java.util.*;
class VectorDemo{
	public static void main(String[] args){
		Vector v = new Vector();

		v.addElement(10);
		v.addElement("Shubham");
		v.addElement(10.5f);
		v.addElement("Saish");
		System.out.println(v);
		Enumeration e = v.elements();
		System.out.println(e.getClass());
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
