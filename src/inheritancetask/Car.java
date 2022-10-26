package inheritancetask;

public class Car {
int yearOfMake=0;
String engineNumber,type;
/*public Car(int inputNum) {
	System.out.println(".....");
}
public Car() {
	System.out.println("...");
}
public Car(String inputString) {
	this();
	System.out.println("Result is :\n"+inputString);
}*/
public void setValue(int yearOfMake,String engineNumber,String type) {
	this.yearOfMake=yearOfMake;
	this.engineNumber=engineNumber;
	this.type=type;
}
public int getYearOfMake(int yearOfMake) {
	return yearOfMake;
}
public String getengineNumber(String engineNumber) {
	return engineNumber;
}
public String getType(String type) {
	return type;
}
public void maintanence() {
	System.out.println("car under maintanence...");
}
}