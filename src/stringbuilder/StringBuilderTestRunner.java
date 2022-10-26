package stringbuilder;
import java.util.Scanner;
import check.UserDefinedException;
public class StringBuilderTestRunner{
	static Scanner input=new Scanner(System.in);
	public static String getString(String inputString){
		boolean flag=false;
		while(!flag){
			if(input.hasNext()){
				inputString=input.next();
				flag=true;
			}
			else{
				System.out.println("Enter a valid Stirng...");
			}
		}
		return inputString;
	}
	public static int getInt(int inputInt){
		boolean flag=false;
		while(!flag){
			if(input.hasNextInt()){
				inputInt=input.nextInt();
				flag=true;
			}
			else{
				input.next();
				System.out.println("Enter a valid integer...");
			}
		}
		return inputInt;
	}
	public static char getChar(char character) {
		boolean flag=false;
		while(!flag) {
			character=input.next().charAt(0);
			if(Character.isLetter(character)) {
				flag=true;
			}
			else {
				System.out.println("Enter a valid character...");
			}
		}
		return character;
	}
	public static void main(String args[])throws UserDefinedException{
		int choice=-1;
		int length=0;
		String inputString="",symbol="",checkString="";
		char character=' ';
		StringBuilderTask task=new StringBuilderTask();
		System.out.println("if you want to stop just enter 0...");
		while(choice!=0){
			System.out.println("Enter your choice: ");
			choice=getInt(choice);
			switch(choice){
			case 1:
			{
				System.out.println("Give the string to find length in StringBuilder class...");
				System.out.println("Empty string length in String Builder: ");
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					int emptyresult=task.findLenghtStringBuilder(sbuilder);
					System.out.println("Result is: \n"+emptyresult);
					System.out.println("length of the StringBuilder :");
					System.out.println("Enter a how many String you want to enter: ");
					length=getInt(length);
					String[]stringArray=new String[length];
					System.out.println("Enter a value: ");
					for(int i=0;i<length;i++) {
					stringArray[i]=getString(inputString);
					}
					sbuilder=task.addNStringinStringBuilder(sbuilder,stringArray);
					System.out.println(sbuilder);
					int result=task.findLenghtStringBuilder(sbuilder);
					System.out.println("Result is: \n"+result);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 2:
			{
				System.out.println("Give first one string find length and then add N number of String to find length...");
				System.out.println("Enter a first value: ");
				inputString=getString(inputString);
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.addNStringinStringBuilder(sbuilder,inputString);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("Add string in String Builder: ");
					System.out.println("Enter a how many Strings you want to enter: ");
					length=getInt(length);
					String [] stringArray=new String[length];
					System.out.println("Enter a values: ");
					for(int i=0;i<length;i++) {
						int j=i+1;
						System.out.print("String "+j+" :");
						stringArray[i]=getString(inputString);
					}
					System.out.println( );
					System.out.println("Enter a which symbol you want to add between each string: ");
					symbol=getString(symbol);
					System.out.println(task.stringBuilderNLength(sbuilder,symbol,stringArray).toString());
					System.out.println("Length Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("Result is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 3:
			{
				System.out.println("Add third string between two string...");
				String firstString="";
				String secondString="";
				int newLength=0;
				System.out.println("Enter a first value: ");
				firstString=getString(firstString);
				System.out.println("Enter a second value: ");
				secondString=getString(secondString);
				//
				System.out.println("Enter a which symbol you want to enter: ");
				symbol=getString(symbol);
				String[]newStringArray=new String[2];
				newStringArray[0]=firstString;
				newStringArray[1]=secondString;
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.stringBuilderNLength(sbuilder,symbol,newStringArray);
					System.out.println("Result is: \n"+sbuilder);
					System.out.println("Add strings between those two string....");
					System.out.println("Enter a how many String you wannt to enter :");
					newLength=getInt(newLength);
					String newString="";
					String []stringSecondArray=new String[newLength];
					System.out.println("Enter a array value : ");
					for(int i=0;i<newLength;i++) {
						int j=i+1;
						newString=getString(inputString);
						stringSecondArray[i]=newString;
					}
					System.out.println( );
					sbuilder=task.addNStringinbetweenStringBuilderString(sbuilder,symbol, stringSecondArray);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("String is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 4:
			{
				int newLength=0;
				System.out.println("Delete to find the StringBuilder length ...");
				System.out.println("Enter a how many String you wannt to enter in array :");
				newLength=getInt(newLength);
				String newString="";
				String []stringArray=new String[newLength];
				System.out.println("Enter a  array value : ");
				for(int i=0;i<newLength;i++) {
					int j=i+1;
					newString=getString(inputString);
					stringArray[i]=newString;
				}
				System.out.println( );
				System.out.println("Enter a which symbol you want to enter: ");
				symbol=getString(symbol);

				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.stringBuilderNLength(sbuilder,symbol, stringArray);
					System.out.println("Check Result is: \n"+sbuilder);
					System.out.println("Check String Builder length: \n"+task.findLenghtStringBuilder(sbuilder));
					sbuilder=task.afterDeleteStringLength(sbuilder,symbol);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("String is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 5:
			{
				System.out.println("Replace hyphen - symbol between string...");
				System.out.println("Enter a how many string you want to enter: ");
				length=getInt(length);
				//
				System.out.println("Enter a which symbol you want to enter: ");
				symbol=getString(symbol);
				//String []stringArray=null;
				String []stringArray=new String[length];
				System.out.println("Enter a values: ");
				for(int i=0;i<length;i++) {
					int j=i+1;
					System.out.print("String "+j+" : ");
					inputString=getString(inputString);
					stringArray[i]=inputString;
				}
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.stringBuilderNLength(sbuilder,symbol,stringArray);
					System.out.println("Check String result is: \n"+sbuilder);
					System.out.println("Enter a wihch symbol you want to replace: ");
					symbol=getString(symbol);
					sbuilder=task.replaceWithSymbol(sbuilder, symbol);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("String is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());	}
				break;
			}
			case 6:
			{
				System.out.println("Reverse the String...");
				System.out.println("Enter a how many string you want to enter: ");
				length=getInt(length);
				//
				System.out.println("Enter a which symbol you want to enter: ");
				symbol=getString(symbol);
				String []stringArray=new String[length];
				System.out.println("Enter a values: ");
				for(int i=0;i<length;i++) {
					int j=i+1;
					System.out.print("String "+j+" : ");
					inputString=getString(inputString);
					stringArray[i]=inputString;
				}
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.stringBuilderNLength(sbuilder,symbol,stringArray);
					System.out.println("Check String result is: \n"+sbuilder);
					sbuilder=task.reverseString(sbuilder);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("String is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 7:
			{
				System.out.println("StringBuilder method to delete the particular index to index...");
				int startIndex=0;
				int endIndex=0;
				System.out.println("Enter a value: ");
				checkString=getString(checkString);
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.addNStringinStringBuilder(sbuilder, checkString);
					System.out.println("Length of check string is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("Enter a starting index for deletion: ");
					startIndex=getInt(startIndex);
					System.out.println("Enter a end index for deletion: ");
					endIndex=getInt(endIndex);
					sbuilder=task.indexBaseDeleteString(sbuilder,startIndex,endIndex);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("String is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());	}
				break;
			}
			case 8:
			{
				System.out.println("Replace the string in paraticula index...");
				int startIndex=0;
				int endIndex=0;
				System.out.println("Enter a value: ");
				checkString=getString(checkString);
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.addNStringinStringBuilder(sbuilder, checkString);
					System.out.println("Length of check string is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("Enter a replace value: ");
					inputString=getString(inputString);
					System.out.println("Enter a starting index for deletion: ");
					startIndex=getInt(startIndex);
					System.out.println("Enter a end index for deletion: ");
					endIndex=getInt(endIndex);
					sbuilder=task.indexBaseReplaceString(sbuilder,startIndex,endIndex,inputString);
					System.out.println("Result is: \n"+task.findLenghtStringBuilder(sbuilder));
					System.out.println("String is: \n"+sbuilder);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 9:
			{
				System.out.println("Give the symbol between the Strings and find index of symbol...");
				System.out.println("Enter a length how many string you want to enter: ");
				length=getInt(length);
				String []stringArray=new String[length];
				System.out.println("Enter a value: ");
				for(int i=0;i<length;i++) {
					int j=i+1;
					System.out.print("String "+j+" : ");
					inputString=getString(inputString);
					stringArray[i]=inputString;
					j++;
				}
				System.out.println("Enter a which symbol you want enter between strings: ");
				symbol=getString(symbol);
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.stringBuilderNLength(sbuilder,symbol,stringArray);
					System.out.println("Check Result is: \n"+sbuilder);
					int result=task.indexOfSymbol(sbuilder, symbol);
					System.out.println("Result of symbol index : \n"+result);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 10:
			{
				System.out.println("Give the symbol between the Strings and find index of symbol...");
				System.out.println("Enter a how many strings you want to enter: ");
				length=getInt(length);
				String []stringArray=new String[length];
				System.out.println("Enter a values: ");
				for(int i=0;i<length;i++) {
					int j=i+1;
					System.out.print("String "+j+" : ");
					inputString=getString(inputString);
					stringArray[i]=inputString;
				}
				System.out.println("Enter a which symbol you want to enter between string :");
				symbol=getString(symbol);
				StringBuilder sbuilder=task.getStringBuilder();
				try {
					sbuilder=task.stringBuilderNLength(sbuilder,symbol,stringArray);
					System.out.println("Check Result is: \n"+sbuilder);
					int result=task.lastIndexOfSymbol(sbuilder,symbol);
					System.out.println("Result of Symbol last index: \n"+result);
				}
				catch(UserDefinedException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			}
			case 0:
			{
				System.out.println("exit");
				break;
			}
			default:
			{
				System.out.println("Invalid Choice...");
			}
			}
		}
	}
}
