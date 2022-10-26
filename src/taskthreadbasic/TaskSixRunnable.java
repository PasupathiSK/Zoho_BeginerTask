package taskthreadbasic;

public class TaskSixRunnable implements Runnable {
	private int inputNum;
	public TaskSixRunnable(int inputNum) {
		this.inputNum=inputNum;
	}
	boolean flag=false;
	@Override
	public void run() {
		int i=1;
		while(!flag) {
		try {
//			printLockedResources();
			System.out.println("Implemented Thread: "+Thread.currentThread().getName());
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

























//thread.sleep(inputNum);
//if(i<=3) {
//	thread.sleep(30000);
//printLockedResources(thread);
//}