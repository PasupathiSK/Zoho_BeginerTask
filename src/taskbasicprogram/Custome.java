package taskbasicprogram;

public class Custome {
private String inputString;
public Custome(String checkString) {
	this.inputString=checkString;
}
public String toString() {
	return this.getClass()+"\nResult is : \n"+inputString;
}
}
