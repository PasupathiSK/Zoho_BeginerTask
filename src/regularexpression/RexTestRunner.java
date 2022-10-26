package regularexpression;

import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RexTestRunner {
	static Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	static Scanner input=new Scanner(System.in);
	
	public static int getInt(int inputNum) {
		boolean flag=false;
		while(!flag) {
			if(input.hasNextInt()) {
				inputNum=input.nextInt();
				flag=true;
			}
			else {
				input.next();
				logger.info("Enter a valid integer...");
			}
		}
		return inputNum;
	}
	public static String getString(String inputString) {
		boolean flag=false;
		while(!flag) {
			if(input.hasNext()) {
				inputString=input.next();
				flag=true;
			}
		}
		return inputString;
	}
	public static <T>List<T> getList(){
		List<T>list=new ArrayList<T>();
		return list;
	}
public static void main(String args[]) {
	int inputNum=0,choice=-1,length=0;
	String inputString="",checkString="",result="";
	logger.info("if you want to stop just enter 0 : ");
	RexTask task=new RexTask();
	while(choice!=0) {
		logger.info("Enter your choice : ");
		choice=getInt(choice);
		switch(choice) {
		case 1 :{
			logger.info("Mobile Number Validation...");
			logger.info("Enter a Mobile Number : ");
			inputString=getString(inputString);
			result=(task.mobileNumberValidation(inputString))?"Yes , Mobile number is valid...":"No , Mobile number is not valid...";
//			if(task.mobileNumberValidation(inputString)) {
//				logger.info("Yes , Mobile number is valid ...");
//			}
//			else {
//				logger.info("No , Mobile number is not valid ....");
//			}
			logger.info(result);
			break;
		}
		case 2: 
		{
			logger.info("AlphaNumeric Validation...");
			logger.info("Enter a value : ");
			inputString=getString(inputString);
			result=(task.alphaNumericValidation(inputString))?"Yes , AlphaNumeric is valid...":"No , AlphaNumric is not valid...";
			logger.info(result);
			break;
		}
		case 3: 
		{
			logger.info("Two String Matching Validation...");
			logger.info("1. check String start with match String\n2. check String contains in match String\n3. check String ends with match String\n4. check String exact match String");
			logger.info("Enter your choice : ");
			inputNum=getInt(inputNum);
			boolean check=(inputNum<=4&&!(inputNum<=0))?true:false;
			logger.info("Enter a value : ");
			inputString=getString(inputString);
			logger.info("Enter a match value : ");
			checkString=getString(checkString);
			result=(check)?(task.twoStringMatchingValidation(inputString, checkString, inputNum))?"Yes , two String Matching Pattern Validated : ":"No , two String Matching Pattern Validated : ":
				"Invalid choice...";
			logger.info(result);
			break;
		}
		case 4:
		{
			logger.info("List of String match with case sensitive...");
			logger.info("Enter a how many String you enter: ");
			length=getInt(length);
			List<String>list=getList();
			logger.info("Enter a value");
			for(int i=0;i<length;i++) {
				list.add(getString(inputString));
			}
			logger.info("Enter a check value : ");
			checkString=getString(checkString);
			for(int i=0;i<length;i++) {
				inputString=list.get(i);
				if(task.checkStringCaseSensitiveValidation(inputString, checkString)) {
					logger.info("validated");
				}
				else {
					logger.info("not validate");
				}
			}
			break;
		}
		case 5:
		{
			logger.info("Email Validation...");
			logger.info("Enter a value : ");
			inputString=getString(inputString);
			if(task.emailValidation(inputString)) {
				logger.info("validated...");
			}
			else {
				logger.info("not validate...");
			}
			break;
		}
		case 6:
		{
			int newLength=0;
			int minLength=0;
			logger.info("String Length check Validation...");
			logger.info("Enter a how many String you enter: ");
			length=getInt(length);
			List<String>list=getList();
			logger.info("Enter a value");
			for(int i=0;i<length;i++) {
				list.add(getString(inputString));
			}
			logger.info("Enter a minumin length of the string ; ");
			minLength=getInt(minLength);
			logger.info("Enter a maximum length of the string : ");
			newLength=getInt(newLength);
			for(int i=0;i<length;i++) {
				inputString=list.get(i);
				if(task.lengthValidation(inputString, minLength,newLength)) {
					logger.info(inputString+" is validated");
				}
				else {
					logger.info(inputString+" is not validate");
				}
			}
			break;
		}
		case 7:
		{
			int newLength=0;
			logger.info("check two list matching pattern and return matching value and index in map : ");
			logger.info("Enter a first list of how many String you enter: ");
			length=getInt(length);
			List<String>fList=getList();
			List<String>sList=getList();
			logger.info("Enter a first value");
			for(int i=0;i<length;i++) {
				fList.add(getString(inputString));
			}
			logger.info("Enter a second list of how many String you enter: ");
			newLength=getInt(newLength);
			logger.info("Enter a second value : ");
			for(int i=0;i<newLength;i++) {
				sList.add(getString(inputString));
			}
			logger.info(""+task.rMap(fList, sList));
			break;
		}
		case 8:
		{
			logger.info("Enter a value : ");
			input.nextLine();
			inputString=input.nextLine();
			logger.info(" "+task.getTagOfString(inputString));
			break;
		}
		case 0:
		{
			logger.info("exit");
			break;
		}
		default:
		{
			logger.info("Invalid choice...");
		}
		}
	}
}
}
