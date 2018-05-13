/**Counter class
*/
/*
* Counter Class
*/
public class Counter{
	// Instance variable
	private int count;
	// default constructor
	public Counter() {}
	// alternate constructor
	public Counter(int initial) { count = initial; }
	// acessor method
	public int getCount() { return count; }
	// update method
	public void increment() { count++; }
	// update method
	public void increment(int delta) { count += delta; }
	// update method
	public void reset() { count = 0; }
}