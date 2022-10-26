package taskbasicprogram;

public class Singleton{
//private static  final Singleton instance=new Singleton();
private static Singleton instance;
String inputString;
private Singleton() {
	inputString="value";
}
//public  static Singleton getInstance() {
//return instance;
//}
public static Singleton getInstance() {
	if(instance==null) {
		synchronized(Singleton.class) {
		if(instance==null) {
		instance=new Singleton();
		}
	}
	}
	return instance;
}
}
