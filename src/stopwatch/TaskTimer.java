package stopwatch;

public class TaskTimer{
	
	Stopwatch sw;
	
	public TaskTimer(Runnable task) {
		sw = new Stopwatch();
		System.out.println(task.toString());
		sw.start();
		task.run();
		sw.stop();
		System.out.println("Elapsed time : "+ sw.getElapsed());
	}
}
