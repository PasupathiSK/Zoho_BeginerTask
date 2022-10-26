package taskbasicprogram;


public class PojoNewCustome {
public String value;
public int length;
public PojoNewCustome() {
	System.out.println("Default constructor...");
}
// EX 6
public PojoNewCustome(String inputString,int length) {
	setString(inputString);
	setInt(length);
}
//
public void setString(String inputString) {
	value=inputString;
}
public String getString() {
	return value;
}
public void setInt(int inputNum) {
	length=inputNum;
}
public int getInt() {
	return length;
}
public String toString() {
	return this.getClass()+"\nResult is :  \n"+value+" "+length;
}
}
