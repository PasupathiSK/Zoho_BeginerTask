package DatabaseConnectivity;

import java.util.Scanner;

import check.UserDefinedException;

public class DBTestRunner {
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
				System.out.println("Enter a valid String...");
			}
		}
		return inputString;
	}
	public static void main(String args[]) {
		int choice=-1,inputNum=0;
		String inputString="",checkString="";
		DBTask task=new DBTask();
		System.out.println("if you want to stop just enter 0...");
		while(choice!=0) {
			try {
			System.out.println("Enter your choice: ");
			choice=getInt(choice);
			switch(choice) {
			case 1:
			{
				System.out.println("Create a Table : ");
				System.out.println("Enter a table name : ");
				inputString=getString(inputString);
				task.createTable(checkString);
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
		catch(UserDefinedException ex) {
			ex.printStackTrace();
		}
	}
	}
}
