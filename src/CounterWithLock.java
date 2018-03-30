import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithLock extends Counter {
	private Lock lock = new ReentrantLock();

	
	/**
	 * Add an amount to the total.
	 */
	public void add(int amount) { 
		try {
			lock.lock();
			super.add(amount);
		}
		finally {
			lock.unlock();
		}
	}
	public void sub(int amount) { 
		try {
			lock.lock();
			super.sub(amount);
		}
		finally {
			lock.unlock();
		}
	}
	
}
