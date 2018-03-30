
public class SynchronousCounter extends Counter {
	public synchronized void add(int amount) {
		super.add(amount);
	}
	public synchronized void sub(int amount) {
		super.sub(amount);
	}
}
