
public class SubtractTask implements Runnable {


	private Counter counter;
	private int limit;

	public SubtractTask(Counter counter, int limit) {
		// TODO Auto-generated constructor stub
		this.counter = counter;
		this.limit = limit;
	}

	@Override
	public void run() {
		for (int k = 1; k <= limit; k++) {
			counter.sub(k);
		}
	}

}
