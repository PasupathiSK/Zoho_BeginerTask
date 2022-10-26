package check;

public class UserDefinedException extends Exception{
           public UserDefinedException(String inputString) {
        	   super(inputString);
           }

		public UserDefinedException(String inputString, Exception ex) {
			super(inputString,ex);
		}
}
