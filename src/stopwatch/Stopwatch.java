package stopwatch;

public class Stopwatch {
	
	private static final double NANOSECOND = 1.0E-9;
	private long startTime;
	private long stopTime;
	private boolean running;
	
	public Stopwatch() {
		running = false;
	}
	
	public void start() {
		if (running == false) {
			startTime = System.nanoTime();
			running = true;
		}
	}
	public void stop() {
		if (running == true) {
			stopTime = System.nanoTime();
			running = false;
		} 
	}
	public boolean isRunning() {
		return running;
	}
	public double getElapsed() {
		if (running) {
			return (System.nanoTime() - startTime)*NANOSECOND;
		}
		else return (stopTime - startTime)*NANOSECOND;
	}
}
