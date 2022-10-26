package taskthreadbasic;

public class TaskSevenRunnable implements Runnable{
	boolean flag=true;
	public void run() {
		while(flag) {
		try {
//			printLockedResources();
			System.out.println("Implemented Thread: "+Thread.currentThread().getName());
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		System.out.println(Thread.currentThread().getName()+" stopped : ");
	}
	public void stopThread(boolean flag) {
		this.flag=flag;
		
	}
}
