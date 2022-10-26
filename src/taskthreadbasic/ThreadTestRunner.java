package taskthreadbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import check.UserDefinedException;

public class ThreadTestRunner {
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
public static void main(String args[]) throws UserDefinedException{
	int choice=-1,inputNum=0;
	String inputString="",checkString="";
//	TaskThreeNameExtended taskThread=new TaskThreeNameExtended();
	System.out.println("if you want to stop just enter 0...");
	while(choice!=0) {
		System.out.println("Enter your choice: ");
		choice=getInt(choice);
		switch(choice) {
		case 1:
		{
//			System.out.println("Enter a thread name: ");
//			inputString=getString(inputString);
//			inputString=null;
			TaskOneExtended task1=new TaskOneExtended();
	        System.out.println("Result is: \n"+task1.getName()+" "+task1.getPriority()+" "+task1.getState());
	        task1.start();
	        System.out.println("Result is: \n"+task1.getName()+" "+task1.getPriority()+" "+task1.getState());
               break;
		}
		case 2:
		{
//			System.out.println("Enter a thread name: ");
//			inputString=getString(inputString);
			TaskTwoImplemented implemented=new TaskTwoImplemented();
			Thread implementedThread=new Thread(implemented);
			System.out.println("Result is: \n"+implementedThread.getName()+" "+implementedThread.getPriority()+" "+implementedThread.getState());
			implementedThread.start();
			System.out.println("Result is: \n"+implementedThread.getName()+" "+implementedThread.getPriority()+" "+implementedThread.getState());
			break;
		}
		case 3:
		{
			System.out.println("Enter a thread name: ");
			inputString=getString(inputString);
			TaskThreeNameExtended NtaskThread=new TaskThreeNameExtended();
			TaskThreeNameRunnable NtaskImplement=new TaskThreeNameRunnable();
			Thread runnableThread=new Thread(NtaskImplement);
			System.out.println("Before...");
			System.out.println("Result is: \n"+NtaskThread.getName()+" "+NtaskThread.getPriority()+" "+NtaskThread.getState());
			System.out.println("Result is: \n"+runnableThread.getName()+" "+runnableThread.getPriority()+" "+runnableThread.getState());
			System.out.println("After...");
			NtaskThread.setName(inputString);
			runnableThread.setName(inputString);
			NtaskThread.start();
			runnableThread.start();
			System.out.println("Result is: \n"+NtaskThread.getName()+" "+NtaskThread.getPriority()+" "+NtaskThread.getState());
			System.out.println("Result is: \n"+runnableThread.getName()+" "+runnableThread.getPriority()+" "+runnableThread.getState());
			break;
		}
		case 4:
		{
			TaskFourRunnable newTask=new TaskFourRunnable();
			System.out.println("Enter a thread name: ");
			inputString=getString(inputString);
			TaskFourExtended task=new TaskFourExtended();
			Thread runnableThread=new Thread(newTask);
			task.setName(inputString);
			runnableThread.setName(inputString);
			task.start();
			runnableThread.start();
			break;
		}
		case 5:
		{
			System.out.println("Enter a  Extended thread name: ");
			inputString=getString(inputString);
			System.out.println("Enter a Runnable thread name : ");
			checkString=getString(checkString);
			int newInputNum=0;
			System.out.println("Enter a first sleep time: ");
			inputNum=getInt(inputNum);
			System.out.println("Enter  a second sleep time: ");
			newInputNum=getInt(newInputNum);
			TaskFiveExtended newtask=new TaskFiveExtended(inputNum);
			TaskFiveRunnable newRunnable=new TaskFiveRunnable(newInputNum);
			Thread runnableThread=new Thread(newRunnable);
			newtask.setName(checkString);
			runnableThread.setName(inputString);
			newtask.start();
			runnableThread.start();
			break;
		}
		case 6:
		{
			System.out.println("Enter a  Extended thread name: ");
			inputString=getString(inputString);
			System.out.println("Enter a Runnable thread name : ");
			checkString=getString(checkString);
			int newInputNum=0;
			System.out.println("Enter a how many times thread you want: ");
			inputNum=getInt(inputNum);
			System.out.println("Enter a how many time thread you want: ");
			newInputNum=getInt(newInputNum);
			TaskSixExtended newtask=new TaskSixExtended(inputNum);
			TaskSixRunnable newRunnable=new TaskSixRunnable(newInputNum);
			Thread runnableThread=new Thread(newRunnable);
			newtask.setName(checkString);
			runnableThread.setName(inputString);
			newtask.start();
			runnableThread.run();
			break;
		}
		case 7:
		{
			System.out.println("Enter a how many threads you want: ");
			inputNum=getInt(inputNum);
			List<TaskSevenExtended>firstList=new ArrayList<TaskSevenExtended>();
			List<TaskSevenRunnable>secondList=new ArrayList<TaskSevenRunnable>();
			List<Thread>runnableList=new ArrayList<Thread>();
			List<Thread>extendedList=new ArrayList<Thread>();
//			Thread[]newExtendedThread=new Thread[inputNum];
//			Thread[]newImplementedThread=new Thread[inputNum];
			String[]extendedThreadArray=new String[inputNum];
			String[]implementedThreadArray=new String[inputNum];
			for(int i=0;i<inputNum;i++) {
				System.out.println("Enter a  Extended thread name: ");
				inputString=getString(inputString);
				extendedThreadArray[i]=inputString;
				System.out.println("Enter a Implemented thread name: ");
				inputString=getString(inputString);
				implementedThreadArray[i]=inputString;
			}
			for(int i=0;i<inputNum;i++) {
				TaskSevenExtended task=new TaskSevenExtended();
				TaskSevenRunnable newTask=new TaskSevenRunnable();
			Thread extendedThread=new Thread(task);
			Thread runnableThread=new Thread(newTask);
			extendedThread.setName(extendedThreadArray[i]);
			runnableThread.setName(implementedThreadArray[i]);
			extendedThread.start();
			runnableThread.start();
			firstList.add(task);
			secondList.add(newTask);
			extendedList.add(extendedThread);
			runnableList.add(runnableThread);
		}
			for(int i=0;i<inputNum;i++) {
				TaskSevenExtended newExtended=firstList.get(i);
				TaskSevenRunnable newImplemented=secondList.get(i);
				try {
					Thread.sleep(10000);
					newExtended.stopThread(false);
					Thread.sleep(10000);
					newImplemented.stopThread(false);
				}
				catch(Exception ex) {
				}
			}
				if(extendedList.get(inputNum-1).isAlive()||runnableList.get(inputNum-1).isAlive()) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				if(!extendedList.get(inputNum-1).isAlive()&&!runnableList.get(inputNum-1).isAlive()) {
					System.out.println("Task Completed...");
				}
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
}
}
