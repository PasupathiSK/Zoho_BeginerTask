package taskthreadbasic;

public class TaskFourRunnable implements Runnable{
		//EX 5

		@Override
		public void run() {
			System.out.println("Going to sleep: "+Thread.currentThread().getName());
			try {
		//		Thread.sleep(inputNum);
				Thread.sleep(30000);
				System.out.println("After Sleeping: "+Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
