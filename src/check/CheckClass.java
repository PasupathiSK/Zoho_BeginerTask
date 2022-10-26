package check;


public class CheckClass {
	public static void checkNull(Object object)throws UserDefinedException{
		if(object==null) {
			throw new UserDefinedException("Error occure...\nGiven is null...");
		}
	}
	public static void checkEmpty(String inputString)throws UserDefinedException {
		if(inputString.isEmpty()) {
			throw new UserDefinedException("Erro occure...\nString is empty...");
		}
	}
	public static void checkIndex(int startIndex,int endIndex,int length)throws UserDefinedException {
		if(startIndex<0||startIndex>length) {
			String result=String.format("Index of String Builder is start from %d to %d but your start index is %d...",0,endIndex,startIndex);
			throw new UserDefinedException(result);
		}
		if(endIndex<0) {
			String result=String.format("Index of String Builder is start from %d but your end index is %d...",0,endIndex);
			throw new UserDefinedException(result);
		}
		if(endIndex<startIndex) {
			String result=String.format("Index of String Builder is start from %d but your end index is %d...",startIndex,endIndex);
			throw new UserDefinedException(result);
		}
	}
}
