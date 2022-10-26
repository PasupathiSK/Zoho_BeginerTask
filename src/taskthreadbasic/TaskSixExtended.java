package taskthreadbasic;


public class TaskSixExtended extends Thread {
	private int inputNum;
	public TaskSixExtended(int inputNum) {
		this.inputNum=inputNum;
	}
	boolean flag=false;
	public void run() {
		int i=0;
		while(!flag) {
		try {
//			printLockedResources();
			System.out.println("Extended Thread: "+Thread.currentThread().getName());
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		i++;
		if(i==inputNum) {
			flag=true;
		}
		}
}
//	public void printLockedResources() {
//		//System.out.println("Result is: \n"+thread.currentThread().getName()+"\nLocked Resuources: \n"+thread);
//		Thread.dumpStack();
//	}
}













//Thread.sleep(inputNum);
//if(i<=3) {
//	thread.sleep(30000);
//printLockedResources(thread);
//}

