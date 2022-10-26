package taskthreadbasic;

public class TaskFiveRunnable implements Runnable {
	//EX 5
	private int inputNum;
	public TaskFiveRunnable(int inputNum) {
		this.inputNum=inputNum;
	}
	@Override
	public void run() {
		System.out.println("Going to sleep: "+Thread.currentThread().getName());
		try {
			Thread.sleep(inputNum);
			//thread.sleep(30000);
			System.out.println("After Sleeping: "+Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
