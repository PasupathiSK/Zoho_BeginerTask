package taskHashMap;

import java .util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import check.UserDefinedException;

public class MapTestRunner {
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
public static String getString(String inputString) {
	boolean flag=false;
	while(!flag) {
		if(input.hasNext()) {
			inputString=input.next();
			flag=true;
		}
		else {
			input.next();
			System.out.println("Enter a valid Stirng....");
		}
	}
	return inputString;
}
public static <T>Map getMap(){
	Map<T,T>map=new HashMap<T,T>();
	return map;
}
public static String[] getStringArray(int length,String[]stringArray) {
	String inputString="";
	for(int i=0;i<length;i++) {
		inputString=getString(inputString);
		stringArray[i]=inputString;
	}
	return stringArray;
}
public static int[] getIntArray(int length,int []inputArray) {
	int inputNum=0;
	for(int i=0;i<length;i++) {
		inputNum=getInt(inputNum);
		inputArray[i]=inputNum;
	}
	return inputArray;
}
public static <T> void main(String args[]) {
	int choice=-1,inputNum=0,length=0;
	String inputString="";
	MapTask task=new MapTask();
	System.out.println("if you want to stop just enter a 0...");
	try {
	while(choice!=0) {
		System.out.println("Enter your choice: ");
		choice=getInt(choice);
		switch(choice) {
		case 1:
		{
			Map<T,T>map=getMap();
			length=task.mapLength(map);
			System.out.println("Result is: \n"+length);
			break;
		}
		case 2:
		{
			int newLength=0;
			/*System.out.println("Enter a how many string keys you want: ");
			length=getInt(length);
			System.out.println("Enter a how many string value you want to enter: ");
			newLength=getInt(newLength);
			String[]keyStringArray=new String[length];
			String[]valueStringArray=new String[newLength];
			System.out.println("Enter a key in array: ");
			keyStringArray=getStringArray(length,keyStringArray);
			System.out.println("Enter a value in array: ");
			valueStringArray=getStringArray(newLength,valueStringArray);
			Map<String,String>map=getMap();
			map=task.addStringKeyValuesinMap(map, keyStringArray, valueStringArray);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));*/
			Map<String,String>map=getMap();
			map.put("value","one");
			map.put("is", "two");
			map.put("v", "three");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 3:
		{
			int newLength=0;
			/*System.out.println("Enter a how many  keys you want: ");
			length=getInt(length);
			System.out.println("Enter a how many  value you want to enter: ");
			newLength=getInt(newLength);
			int[]keyIntArray=new int[length];
			int[]valueIntArray=new int[newLength];
			System.out.println("Enter a key in array: ");
			keyIntArray=getIntArray(length,keyIntArray);
			System.out.println("Enter a value in array: ");
			valueIntArray=getIntArray(newLength,valueIntArray);
			Map<Integer,Integer>map=getMap();
			map=task.addIntKeyValuesinMap(map, keyIntArray, valueIntArray);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));*/
			Map<Integer,Integer>map=new HashMap<Integer,Integer>();
			map.put(1,4);
			map.put(2, 5);
			map.put(3, 6);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 4:
		{
			int newLength=0;
			/*System.out.println("Enter a how many String keys you want: ");
			length=getInt(length);
			System.out.println("Enter a how many  value you want to enter: ");
			newLength=getInt(newLength);
			String[]keyStringArray=new String[length];
			int[]valueIntArray=new int[newLength];
			System.out.println("Enter a key in array: ");
			keyStringArray=getStringArray(length,keyStringArray);
			System.out.println("Enter a value in array: ");
			valueIntArray=getIntArray(newLength,valueIntArray);
			Map<String,Integer>map=getMap();
			map=task.addKeyValuesinMap(map, keyStringArray, valueIntArray);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapStringLength(map));*/
			Map<String,Integer>map=getMap();
			map.put("first", 4);
			map.put("second",5);
			map.put("third", 6);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 5:
		{
			/*System.out.println("Enter a how many String keys you want: ");
			length=getInt(length);
			String[]keyStringArray=new String[length];
			System.out.println("Enter a key in array: ");
			keyStringArray=getStringArray(length,keyStringArray);
			Map<String,Object>map=getMap();
			map=task.addStringKeyObjectValuesinMap(map, keyStringArray, input);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapStringLength(map));*/
			Map<String,Object>map=getMap();
			map.put("first", input);
			map.put("second", input);
			map.put("third", args);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 6:
		{
			/*System.out.println("Enter a how many String keys you want: ");
			length=getInt(length);
			String[]keyStringArray=new String[length];
			System.out.println("Enter a key in array: ");
			keyStringArray=getStringArray(length,keyStringArray);
			System.out.println("Enter a which string key you want : ");
			inputString=getString(inputString);
			Map<String,T>map=getMap();
			map=task.addKeyNullinMap(map, keyStringArray, inputString);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapStringLength(map));*/
			Map<String,String>map=getMap();
			map.put("first", "one");
			map.put("second", "two");
			map.put("third", null);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 7:
		{
			Map<String,String>map=getMap();
			map.put(null, "check");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is; \n"+task.mapLength(map));
			break;
		}
		case 8:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key you want present: ");
			inputNum=getInt(inputNum);
			if(task.checkKeyContains(map, inputNum)) {
				System.out.println("key "+inputNum+" is presented...");
			}
			else {
				System.out.println("key "+inputNum+" is not presented...");
			}
			break;
		}
		case 9:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which String value you want present: ");
			inputString=getString(inputString);
			if(task.checkValueContains(map, inputString)) {
				System.out.println("value "+inputString+" is presented...");
			}
			else {
				System.out.println("value "+inputString+" is not presented...");
			}
			break;
		}
		case 10:
		{
			Map<String,String>map=getMap();
			map.put("first", "one");
			map.put("second", "two");
			map.put("third", "three");
			inputString="value";
			String firstString="is";
			String secondString="value";
			map=task.replaceValuesinMap(map, inputString, firstString, secondString);
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 11:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want: ");
			inputNum=getInt(inputNum);
			String result=task.getKeyValueinMap(map, inputNum);
			System.out.println("Result is: \n"+result);
			break;
		}
		case 12:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want: ");
			inputNum=getInt(inputNum);
			String result=task.getKeyValueinMap(map, inputNum);
			System.out.println("Result is: \n"+result);
			break;
		}
		case 13:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want: ");
			inputNum=getInt(inputNum);
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			System.out.println(task.checkNonkeyContainValueinMap(map, inputNum,"zoho"));
			System.out.println("After find key is not...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 14:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want to delete: ");
			inputNum=getInt(inputNum);
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			map=task.removeKeyValueinMap(map, inputNum);
			System.out.println("After find key is not...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 15:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want to delete: ");
			inputNum=getInt(inputNum);
			System.out.println("Enter a which String value you want to delete: ");
			inputString=getString(inputString);
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			map=task.checkKeyValueinMap(map, inputNum, inputString);
			System.out.println("After find key has same value: ");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 16:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want to replace: ");
			inputNum=getInt(inputNum);
			System.out.println("Enter a value: ");
			inputString=getString(inputString);
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			map=task.replaceKeyValueinMap(map, inputNum, inputString);
			System.out.println("After find key has replace value: ");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 17:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Enter a which integer key value you want to replace: ");
			inputNum=getInt(inputNum);
			System.out.println("Enter a value: ");
			inputString=getString(inputString);
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			map=task.replaceKeyValueinMap(map, inputNum, inputString);
			System.out.println("After find key has replace value: ");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 18:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			Map<Integer,String>newMap=getMap();
			newMap.put(3,"value");
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			System.out.println("Result is: \n"+newMap);
			System.out.println("Size is: \n"+task.mapLength(newMap));
			newMap=task.addMapinMap(map, newMap);
			System.out.println("After check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			System.out.println("Result is: \n"+newMap);
			System.out.println("Size is: \n"+task.mapLength(newMap));
			break;
		}
		case 19:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			Set set=map.entrySet();
			System.out.println("Result is: ");
			Iterator iterator=set.iterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next()+" ");
			}
			System.out.println( );
			break;
		}
		case 20:
		{
			Map<Integer,String>map=getMap();
			map.put(5, "value");
			map.put(15, "is");
			map.put(8, "value");
			System.out.println("Before check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			map=task.removeMap(map);
			System.out.println("After check...");
			System.out.println("Result is: \n"+map);
			System.out.println("Size is: \n"+task.mapLength(map));
			break;
		}
		case 21:
		{
			System.out.println("check : ");
//		   System.out.println(task.mapLength(null));
//		   System.out.println(task.mapStringLength(null));
//		   System.out.println(task.checkKeyContains(null, 0));
//		   System.out.println(task.checkValueContains(null,null));
//		   System.out.println(task.replaceValuesinMap(null, null, null, null));
//		   System.out.println(task.getKeyValueinMap(null, 0));
//		   System.out.println(task.checkNonkeyContainValueinMap(null, 0));
//		   System.out.println(task.removeKeyValueinMap(null, 0));
//		   System.out.println(task.checkKeyValueinMap(null, 0, null));
//		   System.out.println(task.replaceKeyValueinMap(null, 0, null));
		   System.out.println(task.addMapinMap(null, null));
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
	}
	catch(UserDefinedException ex) {
		System.out.println(ex.getMessage());
	}
}
}
