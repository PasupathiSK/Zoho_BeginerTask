package inheritancetask;

public class Swift extends Car {
	int seats,airbags;
	String color,model;
	public void setValue(int seats,int airbags,String color,String model) {
		this.seats=seats;
		this.airbags=airbags;
		this.color=color;
		this.model=model;
	}
	public int getSeats(int seats) {
		return seats;
	}
	public int getAirBags(int airbags) {
		return airbags;
	}
	public String getColor(String color) {
		return color;
	}
	public String getModel(String model) {
		return model;
	}
}
