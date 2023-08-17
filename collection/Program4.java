import java.util.*;
class Movies{
	String movieName = null;
	double totColl = 0.0;
	float imdbRating = 0.0f;

	Movies(String movieName, double totColl, float imdbRating){
		this.movieName = movieName;
		this.totColl = totColl;
		this.imdbRating = imdbRating;
	}
	public String toString(){
		return movieName;
	}
}

class SortByName {
	public int compare(Object obj1, Object obj2){
		
	}
}
class UserListSort{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(new Movies("Ved", 200.00, 8.9f));
		al.add(new Movies("Sairat", 500.00, 9.9f));
		al.add(new Movies("Mulshi Pattern", 600.00, 10.0f));
		al.add(new Movies("MumbaiPuneMumbai", 200.00, 7.9f));
		al.add(new Movies("Duniyadari", 150.00, 8.9f));
		al.add(new Movies("TiSaddhyaKayKarte", 600.00, 11.0f));

		System.out.println(al);

	}
}
