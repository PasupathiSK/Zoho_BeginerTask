package listtask;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import check.UserDefinedException;

public class ListTestRunner {
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
				System.out.println("Enter a valid integer...");
			}
		}
		return inputNum;
	}
	public static float getFloat(float inputNum) {
		boolean flag=false;
		while(!flag) {
			if(input.hasNextFloat()) {
				inputNum=input.nextFloat();
				flag=true;
			}
			else {
				input.next();
				System.out.println("Enter a valid float...");
			}
		}
		return inputNum;
	}
	public static long getLong(long inputNum) {
		boolean flag=false;
		while(!flag) {
			if(input.hasNextLong()) {
				inputNum=input.nextLong();
				flag=true;
			}
			else {
				input.next();
				System.out.println("Enter a valid float...");
			}
		}
		return inputNum;
	}
	public static String getString(String inputString) {
		boolean flag=false;
		while(!flag){
		if(input.hasNext()){
		inputString=input.next();
		flag=true;
		}
		else{
			input.next();
		System.out.println("Enter a valid Stirng...");
		}
		}
		return inputString;
	}
	public static <T>List  getList(){
		List<T> list=new ArrayList<T>();
		return list;
	}
public static void main(String args[]) {
	int length=0,choice=-1,inputNum=0;
	String inputString="";
	ListTask task=new ListTask();
	System.out.println("if you want to stop just enter 0...");
	while(choice!=0) {
		System.out.println("Enter your choice: ");
		choice=getInt(choice);
		try {
		switch(choice) {
		case 1:
		{
			System.out.println("Enter only integer values...");
			//System.out.println("Enter a how many elements you want to enter: ");
			//length=getInt(length);
			List<String>arraylist=getList();
			int result=task.lengthNList(arraylist);
			System.out.println("Result is: \n"+result);
			break;
		}
		case 2:
		{
			System.out.println("Enter a how many strings you want to enter: ");
			length=getInt(length);
			String []stringArray=new String[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				int j=i+1;
				System.out.print("String "+j+" : ");
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println("Result is: \n"+task.addList(stringArray));
			System.out.println("size is: "+task.lengthNList(arraylist));
			break;
		}
		case 3:
		{
			System.out.println("Enter a how many elements you want to enter: ");
			length=getInt(length);
			int []inputArray=new int[length];
			System.out.println("Enter a value: ");
			for(int i=0;i<length;i++) {
				inputArray[i]=getInt(inputNum);
			}
			List<Integer>arraylist=getList();
			arraylist=task.addNIntList(inputArray);
			System.out.println("Result is: "+task.addNIntList(inputArray));
			System.out.println("size is: "+task.lengthNIntList(arraylist));
			break;
		}
		case 4:
		{
			String city="",country="";
			int year=0;
			System.out.println("Enter a city: ");
			city=getString(city);
			System.out.println("Enter a country: ");
			country=getString(country);
			System.out.println("Enter a year: ");
			year=getInt(year);
			custome customeobject=new custome(city,country,year);
			List<custome>arraylist=getList();
			arraylist=customeobject.addObject(customeobject);
			for(int i=0;i<arraylist.size();i++) {
				customeobject=arraylist.get(i);
				System.out.println("Result is: \n"+customeobject.city+" "+customeobject.country+" "+customeobject.year);
			}
			System.out.println("size is: "+arraylist.size());
			break;
		}
		case 5:
		{
			int intLength=0;
			System.out.println("Enter a how many element you want to enter: ");
			intLength=getInt(intLength);
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			List<Object>arraylist=getList();
			int []intArray=new int[intLength];
			System.out.println("Enter a values: ");
			for(int i=0;i<intLength;i++) {
				intArray[i]=getInt(inputNum);
				}
			System.out.println("Enter a values: ");
			String []stringArray=new String[length];
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			Scanner sc=new Scanner(System.in);
			arraylist=task.addAllList(intArray, stringArray,input,sc);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthObjectList(arraylist));
			break;
		}
		case 6:
		{
			System.out.println("Enter a how many String you want to enter: ");
			length=getInt(length);
			String []stringArray=new String[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			System.out.println("Enter a which string index you want to know :");
			inputString=getString(inputString);
			arraylist=task.addList(stringArray);
			//arraylist=null;
			int result=task.indeoxOfList(arraylist,inputString);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Index: \n"+result);
			break;
		}
		case 7:
		{
			System.out.println("Enter a how many String you want to enter: ");
			length=getInt(length);
			String []stringArray=new String[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println("Result is: ");
			for(Iterator <String>iterator=arraylist.iterator();iterator.hasNext();) {
				System.out.print(iterator.next()+" ");
			}
			System.out.println( );
			break;
		}
		case 8:
		{
			System.out.println("Enter a how many String you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			System.out.println("Enter a value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			System.out.println("Enter a index :");
			inputNum=getInt(inputNum);
			arraylist=task.addList(stringArray);
			String result=task.indexOfStringinList(arraylist, inputNum);
			System.out.println("Result is: \n"+result);
			System.out.println("Size is: \n"+task.lengthNList(arraylist));
			break;
		}
		case 9:
		{
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println(arraylist);
			System.out.println("Enter a which duplicate element first and last index you want: ");
			inputString=getString(inputString);
			int firstIndex=task.indeoxOfList(arraylist, inputString);
			int lastIndex=task.lastIndexOfStringinList(arraylist, inputString);
			System.out.println("First index of "+inputString+" : "+firstIndex);
			System.out.println("Last index of "+inputString+" : "+lastIndex);
			break;
		}
		case 10:
		{
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			System.out.println("Enter a value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println("Enter a value: ");
			inputString=getString(inputString);
			System.out.println("Enter a which position you want to add: ");
			inputNum=getInt(inputNum);
			arraylist=task.addStringNPostioninList(arraylist, inputString, inputNum);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNList(arraylist));
			break;
		}
		case 11: 
		{
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			String[]newstringArray=new String[length];
			System.out.println("Enter a first value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			System.out.println("Enter a second value: ");
			for(int i=0;i<length;i++) {
				newstringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			List<String>newarraylist=getList();
			arraylist=task.addList(stringArray);
			newarraylist=task.addList(newstringArray);
			System.out.println("Resutl is: \n"+arraylist);
			System.out.println("Result is: \n"+newarraylist);
			System.out.println("Enter  a which position start: ");
			inputNum=getInt(inputNum);
			newarraylist=task.addListAtPosition(arraylist, newarraylist, inputNum);
			System.out.println("Result is: \n"+newarraylist);
			System.out.println("Size is: \n"+task.lengthNList(newarraylist));
			break;
		}
		case 12:
		{
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			String[]newstringArray=new String[length];
			System.out.println("Enter a first value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			System.out.println("Enter a second value: ");
			for(int i=0;i<length;i++) {
				newstringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			List<String>newarraylist=getList();
			List<String>thirdarraylist=getList();
			arraylist=task.addList(stringArray);
			newarraylist=task.addList(newstringArray);
			System.out.println("Resutl is: \n"+arraylist);
			System.out.println("Result is: \n"+newarraylist);
			thirdarraylist=task.addAllArrayList(arraylist,newarraylist, thirdarraylist);
			System.out.println("Result is: \n"+thirdarraylist);
			System.out.println("Size is: \n"+task.lengthNList(thirdarraylist));
			break;
		}
		case 13:
		{
			int newLength=0;
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			System.out.println("Enter a first value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			System.out.println("Enter a how many string you want to enter: ");
			newLength=getInt(newLength);
			String[]newstringArray=new String[newLength];
			System.out.println("Enter a second value: ");
			for(int i=0;i<newLength;i++) {
				newstringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			List<String>newarraylist=getList();
			List<String>thirdarraylist=getList();
			arraylist=task.addList(stringArray);
			newarraylist=task.addList(newstringArray);
			System.out.println("Resutl is: \n"+arraylist);
			System.out.println("Result is: \n"+newarraylist);
			thirdarraylist=task.addAllArrayList(newarraylist,arraylist, thirdarraylist);
			System.out.println("Result is: \n"+thirdarraylist);
			System.out.println("Size is: \n"+task.lengthNList(thirdarraylist));
			break;
		}
		case 14:
		{
			float inputDecimal=0f,checkDecimal=0f;
			System.out.println("Enter a how many decimal you want to enter: ");
			length=getInt(length);
			float[]floatArray=new float[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				floatArray[i]=getFloat(inputDecimal);
			}
			List<Float>arraylist=getList();
			arraylist=task.addNDecimalinList(floatArray);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Enter a which decimal you want to delete: ");
			checkDecimal=getFloat(checkDecimal);
			arraylist=task.particularDecimalRemoveinList(arraylist, checkDecimal);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNFloatList(arraylist));
			break;
		}
		case 15:
		{
			float inputDecimal=0f;
			System.out.println("Enter a how many decimal you want to enter: ");
			length=getInt(length);
			float[]floatArray=new float[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				floatArray[i]=getFloat(inputDecimal);
			}
			List<Float>arraylist=getList();
			arraylist=task.addNDecimalinList(floatArray);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Enter a which position you want to delete: ");
			inputNum=getInt(inputNum);
			arraylist=task.particularPositionRemoveinList(arraylist, inputNum);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNFloatList(arraylist));
		}
		case 16:
		{
			long inputLong=0;
			int startIndex=0,endIndex=0;
			System.out.println("Enter a how many decimal you want to enter: ");
			length=getInt(length);
			long[]longArray=new long[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				longArray[i]=getLong(inputLong);
			}
			List<Long>arraylist=getList();
			arraylist=task.addNLongDecimalinList(longArray);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Enter a which start index you want to delete: ");
			startIndex=getInt(startIndex);
			System.out.println("Enter a which end index you want to delete: ");
			endIndex=getInt(endIndex);
			arraylist=task.particularIndext0RemoveinList(arraylist, startIndex, endIndex);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNLongList(arraylist));
			break;
		}
		case 17:
		{
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			String[]newstringArray=new String[length];
			System.out.println("Enter a first value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			List<String>newarraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Enter a how many previoust stirng add: ");
			inputNum=getInt(inputNum);
			newarraylist=task.addListinList(arraylist, newarraylist, inputNum);
			System.out.println("After add first arraylist in second array list: ");
			System.out.println("Result is: \n"+newarraylist);
			arraylist=task.ListinList(arraylist, newarraylist, inputNum);
			System.out.println("After remove in first array list which is present in second array list:  ");
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNList(arraylist));
			break;
		}
		case 18:
		{
			System.out.println("Enter a how many string you want to enter: ");
			length=getInt(length);
			String[]stringArray=new String[length];
			String[]newstringArray=new String[length];
			System.out.println("Enter a first value: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			List<String>newarraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Enter a how many previoust stirng add: ");
			inputNum=getInt(inputNum);
			newarraylist=task.addListinList(arraylist, newarraylist, inputNum);
			System.out.println("After add first arraylist in second array list: ");
			System.out.println("Result is: \n"+newarraylist);
			arraylist=task.addListinList(arraylist, newarraylist, inputNum);
			System.out.println("After remove in first array list which is present in second array list:  ");
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNList(arraylist));
			break;
		}
		case 19:
		{
			long inputLong=0;
			int startIndex=0,endIndex=0;
			System.out.println("Enter a how many decimal you want to enter: ");
			length=getInt(length);
			long[]longArray=new long[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				longArray[i]=getLong(inputLong);
			}
			List<Long>arraylist=getList();
			arraylist=task.addNLongDecimalinList(longArray);
			System.out.println("Result is: \n"+arraylist);
			arraylist=task.removeAllinList(arraylist);
			System.out.println("After remove all in array list: ");
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Size is: \n"+task.lengthNLongList(arraylist));
			break;
		}
		case 20:
		{
			System.out.println("Enter a how many String you want to enter: ");
			length=getInt(length);
			String []stringArray=new String[length];
			System.out.println("Enter a values: ");
			for(int i=0;i<length;i++) {
				stringArray[i]=getString(inputString);
			}
			List<String>arraylist=getList();
			arraylist=task.addList(stringArray);
			System.out.println("Result is: \n"+arraylist);
			System.out.println("Enter a which string you want find out it is present or not in array list: ");
			inputString=getString(inputString);
			if(task.checkStirngPresentinList(arraylist, inputString)) {
				System.out.println("Yes it is present in Array list...");
			}
			else {
				System.out.println("No it is not present in Array list...");
			}
			break;
		}
		case 21:
		{
			System.out.println("check...");
			try {
			//System.out.println("1. \n"+task.lengthNList(null));
			//System.out.println("2. \n"+task.lengthNIntList(null));
			//System.out.println("3. \n"+task.lengthNFloatList(null));
			//System.out.println("4. \n"+task.lengthNLongList(null));
			//System.out.println("5. \n"+task.addList(null, 5));
			//System.out.println("6. \n"+task.addNIntList(null, 6));
			//System.out.println("7. \n"+task.lengthObjectList(null));
			//System.out.println("8. \n"+task.addAllList(null,null,null,null));
	////		System.out.println("9. \n"+task.indeoxOfList(getList(), " "));
		////	System.out.println("10. \n"+task.indexOfStringinList(getList(),0));
			//System.out.println("11. \n"+task.firstIndexOfStringinList(null,null));
			//System.out.println("12. \n"+task.lastIndexOfStringinList(null,null));
	/////		System.out.println("13. \n"+task.addStringNPostioninList(getList(),null,0));
		////	System.out.println("14. \n"+task.addListAtPosition(null, getList(),0));
////			System.out.println("15. \n"+task.addAllArrayList(null,null,getList()));
			//System.out.println("16. \n"+task.addCloneList(null, null,null));
			//System.out.println("17. \n"+task.addNDecimalinList(null, 5));
			//System.out.println("18. \n"+task.particularDecimalRemoveinList(null, 5));
			//System.out.println("19. \n"+task.particularPositionRemoveinList(null,3));
			//System.out.println("20. \n"+task.addNLongDecimalinList(null, 5));
			//System.out.println("21. \n"+task.particularIndext0RemoveinList(null,5,3));
			//System.out.println("22. \n"+task.addListinList(null, null, 5));
			//System.out.println("23. \n"+task.ListinList(null, null, 5));
			//System.out.println("24. \n"+task.removeAllinList(null));
			System.out.println("25. \n"+task.checkStirngPresentinList(null, null));
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
			System.out.println("Invalid choice...");
		}
		}
		}
		catch(UserDefinedException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
}
