import java.util.*;
class Movies implements Comparable{
	String movieName = null;
	float totColl = 0;
	Movies(String movieName, float totColl){
		this.movieName = movieName;
		this.totColl = totColl;
	}
	public int compareTo(Object obj){
		return (movieName.compareTo((Movies)obj.movieName));	
	}

}

class TreeSetDemo{
	public static void main(String[] args){
		Treeset ts = new TreeSet();

		ts.add(new Movies("Fight Club", 500.00f));
		ts.add(new Movies("Social Networks", 300.00f));
		ts.add(new Movies("Titanic", 1000.00f));
		ts.add(new Movies("Mulshi Pattern", 400.00f));

		System.out.println(ts);

	}
}
