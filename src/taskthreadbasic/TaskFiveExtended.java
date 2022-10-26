package taskthreadbasic;

public class TaskFiveExtended extends Thread{
	//EX 5
	private int inputNum;
	public TaskFiveExtended(int inputNum) {
		this.inputNum=inputNum;
	}
	public void run() {
		System.out.println("Going to sleep: "+Thread.currentThread().getName());
		try {
			Thread.sleep(inputNum);
			//Thread.sleep(30000);
			System.out.println("After sleep: "+Thread.currentThread().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
