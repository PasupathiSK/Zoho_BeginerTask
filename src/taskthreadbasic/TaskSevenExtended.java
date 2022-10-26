package taskthreadbasic;

public class TaskSevenExtended extends Thread{
		boolean flag=true;
		public void run() {
			while(flag) {
			try {
				System.out.println("Extended Thread: "+Thread.currentThread().getName());
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
		public void printLockedResources() {
			//System.out.println("Result is: \n"+thread.currentThread().getName()+"\nLocked Resuources: \n"+thread);
			Thread.dumpStack();
		}
	}













	//Thread.sleep(inputNum);
	//if(i<=3) {
//		thread.sleep(30000);
	//printLockedResources(thread);
	//}


