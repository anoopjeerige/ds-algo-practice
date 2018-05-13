
public class CounterDemo {
	public static void main(String[] args) {
		// Declare counter variable
		Counter c;
		// Construct and assign its reference
		c = new Counter();
		c.increment();
		c.increment(3);
		System.out.println(c.getCount());
		c.reset();
		System.out.println(c.getCount());
	}
}