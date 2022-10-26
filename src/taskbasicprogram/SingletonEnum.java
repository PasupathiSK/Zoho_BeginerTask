package taskbasicprogram;

public enum SingletonEnum {
instance;
	private String inputString;
	private SingletonEnum(String iString) {
		this.inputString=iString;
	}
	SingletonEnum() {
	}
	private String getString() {
		return inputString;
	}
}
