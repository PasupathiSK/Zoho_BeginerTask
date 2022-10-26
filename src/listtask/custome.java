package listtask;
import java.util.ArrayList;
public class custome {
	String city;
	String country;
	int year;
	public custome(String city,String country,int year) {
		this.city=city;
		this.country=country;
		this.year=year;
	}
	public ArrayList<custome> addObject(custome task){
		ArrayList<custome>arraylist=new ArrayList<custome>();
		arraylist.add(task);
		return arraylist;
	}
}
