package taskbasicprogram;

import java.util.Scanner;
import java.util.logging.Logger;
import java.time.ZoneId;
import java.util.Properties;

import check.UserDefinedException;

public class BasicProgramTestRunner {
public static final Logger logger=Logger.getLogger(BasicProgramTestRunner.class.getName());
static Scanner input=new Scanner(System.in);
public static String getString(String inputString) {
	boolean flag=false;
	while(!flag) {
		if(input.hasNext()) {
			inputString=input.next();
			flag=true;
		}
		else {
			input.next();
			logger.info("Enter a valid string...");
		}
	}
	return inputString;
}
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
public static String[] getStringArray(int length) {
	String inputString="";
	String[]stringArray=new String[length];
	for(int i=0;i<length;i++) {
		inputString=getString(inputString);
		stringArray[i]=inputString;
	}
	return stringArray;
}
//public enum Color{
//	Indigo(1),Violet(2),Red(3),Orange(4),Yellow(5),Green(6),Blue(7);
//	public int value;
//	Color(int value) {
//		this.value=value;
//	}
//	}
public static void main(String args[]) throws UserDefinedException {
	int inputNum=0,choice=-1,length=0;
	String inputString="",checkString="";
	FileTask task=new FileTask();
	DateTime dateTime=new DateTime();
	logger.info("if you want to stop just enter a 0...");
	while(choice!=0) {
		try {
		logger.info("Enter your choice: ");
		choice=getInt(choice);
		switch(choice) {
		case 1:
		{
			logger.info("Enter a file name : ");
			checkString=getString(checkString);
			logger.info("Enter length of how many string you enter : ");
			length=getInt(length);
			input.nextLine();
			String[]sArray=new String[length];
			logger.info("Enter a values : ");
			for(int i=0;i<length;i++) {
				System.out.print("Enter a "+(i+1)+" value : ");
				inputString=input.nextLine();
				sArray[i]=inputString;
			}
				task.createWriteInFile(checkString,sArray);
			break;
		}
		case 2:
		{
			Properties properties=new Properties();
			String fName="";
			logger.info("Enter a File name : ");
			fName=getString(fName);
			logger.info("Enter a how many keys and values you enter : ");
			length=getInt(length);
			for(int i=0;i<length;i++) {
			logger.info("Enter a String key: ");
			inputString=getString(inputString);
			logger.info("Enter a String Value: ");
			checkString=getString(checkString);
			properties.setProperty(inputString,checkString);
			}
			task.loadMapInProperties(fName,properties);

			break;
		}
		case 3:{
			logger.info("Enter a File name : ");
			inputString=getString(inputString);
			Properties properties=new Properties();
			task.loadKeyValuesInProperties(properties,inputString);
			logger.info("Result is : "+properties);
			break;
		}
		case 4:
		{
			String path="",fName="";
			logger.info("Enter a File path : ");
			path=getString(path);
			logger.info("Task One : \nEnter a first File name : ");
			fName=getString(fName);
			if(task.createFile(path)) {
				logger.info("Directory is created...");
			}
			else {
				logger.info("Directory is not created...");
			}
// EX 1
			logger.info("Enter length of how many string you enter : ");
			length=getInt(length);
			input.nextLine();
			String[]sArray=new String[length];
			logger.info("Enter a values : ");
			for(int i=0;i<length;i++) {
				System.out.print("Enter a "+(i+1)+" value : ");
				inputString=input.nextLine();
				sArray[i]=inputString;
			}
				task.createWriteInFile(fName,sArray);
// EX 2
				Properties properties=new Properties();
				logger.info("Enter a how many keys and values you enter : ");
				length=getInt(length);
				for(int i=0;i<length;i++) {
				logger.info("Enter a String key: ");
				inputString=getString(inputString);
				logger.info("Enter a String Value: ");
				checkString=getString(checkString);
				properties.setProperty(inputString,checkString);
				}
				task.loadMapInProperties(fName,properties);
// EX 3
				task.loadKeyValuesInProperties(properties,fName);
				logger.info("Result is : "+properties);
			break;
		}
		case 5:
		{
			logger.info("Enter a value: ");
			inputString=getString(inputString);
		    Custome taskCheck=new Custome(inputString);
			logger.info("Result is: \n"+taskCheck);
			break;
		}
		case 6:
		{
			logger.info("Enter a value: ");
			inputString=getString(inputString);
			logger.info("Enter a length: ");
			length=getInt(length);
			PojoNewCustome newcustome=new PojoNewCustome(inputString,length);
			logger.info(""+newcustome);
			break;
		}
		case 7:
		{
			logger.info("Enter a value: ");
			inputString=getString(inputString);
			logger.info("Enter a length: ");
			length=getInt(length);
			PojoNewCustome newMethodCustome=new PojoNewCustome();
			newMethodCustome.setInt(length);
			newMethodCustome.setString(inputString);
			logger.info("Result is: \n"+newMethodCustome.getString()+" "+newMethodCustome.getInt());
			break;
		}
		case 8:
		{
			
			break;
			
		}
		case 0:
		{
			logger.info("exit");
			break;
		}
		case 9:
		{
			logger.info("Result is: ");
			for(Color color:Color.values()) {
				logger.info(color+" "+color.value());
			}
			break;
		}
		case 10:
		{
//			Singleton firstSingleton=Singleton.getInstance();
//			Singleton secondSingleton=Singleton.getInstance();
//			Singleton thirdSingleton=Singleton.getInstance();
			Singleton firstSingleton=Singleton.getInstance();
			firstSingleton.inputString=firstSingleton.inputString.toUpperCase();
			logger.info("Result is: \n"+firstSingleton.inputString);
			break;
		}
		case 11:
		{
			long tInMillies=0;
			
// EX 1
			logger.info("1. dd-MM-yyy HH:mm:ss\n2.HH:mm:ss dd-MM-yyyy\n3. dd-MM-yyyy\n4. HH:mm:ss");
			logger.info("Enter a patern : ");
			inputNum=getInt(inputNum);
			inputString=(inputNum==1)?("dd-MM-yyy HH:mm:ss"):(inputNum==2)?("HH:mm:ss dd-MM-yyyy"):(inputNum==3)?("dd-MM-yyyy"):(inputNum==4)?("HH:mm:ss"):"Invalid choice...";
			if(inputNum<=4&&!(inputNum<=0)) {
  			 logger.info("\nCurrent Date and Time: "+dateTime.currentDateTime(inputString)+"\n");
			}
			else {
				logger.info(checkString);
			}
// EX 2
			logger.info("\nCurrent Time in MilliSeconds: "+dateTime.currentTimeInMillis()+"\n");
// EX 3
			logger.info("Enter a Zone Id : ");
			ZoneId zoneId=ZoneId.systemDefault();
			logger.info("\nNew York and London DateTime: \n"+dateTime.currentTimeInParticularZone("America/New_York",inputString)+"\n"+dateTime.currentTimeInParticularZone("Europe/London",inputString)+"\n");
			logger.info("\n\nEnter a time in Millis : ");
			//tInMillies=input.nextLong();
			tInMillies=dateTime.currentTimeInMillis();
// EX 4
			logger.info("\n"+dateTime.dayOfWeek(tInMillies,zoneId.toString())+"\n");
			logger.info("\n"+dateTime.currentDayOfWeek()+"\n");
// EX 5
			logger.info("\n"+dateTime.rMonth(tInMillies,zoneId.toString())+"\n");
			logger.info("\n"+dateTime.currentMonth()+"\n");
 //EX 6
			logger.info("\n"+dateTime.getYear(tInMillies,zoneId.toString())+"\n");
			logger.info("\n"+dateTime.currentYear()+"\n");
			break;
		}
		case 12:
		{
			logger.info("Check : ");
//			task.createWriteinFile(null,null); // 1
//			task.loadMapinProperties(null,null,nulll); // 2
//			task.createFile(" ", " "); //4
//			logger.info(""+dateTime.currentTimeinLondonNewYork(null)+""+dateTime.currentTimeinLondonNewYork(null)); // case 11 EX 3
			break;
		}
		default:
		{
			logger.info("Invalid choice...");
		}
		}
		}
	catch(UserDefinedException ex) {
		ex.printStackTrace();
	}
}
}
}
