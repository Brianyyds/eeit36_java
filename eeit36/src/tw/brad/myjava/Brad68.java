package tw.brad.myjava;

import java.util.Timer;
import java.util.TimerTask;

public class Brad68 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		MyTask myTask = new MyTask();
		timer.schedule(myTask, 1*1000, 1*1000);
		
		EndTask endTask = new EndTask(timer);
		timer.schedule(endTask, 12*1000);
		
		System.out.println("main");
	}

}

class MyTask extends TimerTask {
	private int i;
	@Override
	public void run() {
		System.out.println("OK:" + i++);
	}
}
class EndTask extends TimerTask {
	private Timer timer;
	public EndTask(Timer timer) {
		this.timer = timer;
	}
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
}
