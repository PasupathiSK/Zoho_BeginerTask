package taskthreadbasic;

public class TaskFourExtended extends Thread{
	//EX 4
		public void run() {
			System.out.println("Going to sleep: "+Thread.currentThread().getName());
			try {
			//	Thread.sleep(inputNum);
				Thread.sleep(30000);
				System.out.println("After sleep: "+Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
