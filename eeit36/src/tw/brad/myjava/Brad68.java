package tw.brad.myjava;

import java.util.Timer;
import java.util.TimerTask;

public class Brad68 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		MyTask myTask = new MyTask();
		timer.schedule(myTask, 10*1000);
		
		EndTask endTask = new EndTask(timer);
		timer.schedule(endTask, 12*1000);
		
		System.out.println("main");
	}

}

class MyTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("OK");
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
