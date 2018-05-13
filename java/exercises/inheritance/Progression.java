/** Generates a simple progression. By default 0, 1, 2,...*/
public class Progression {

	// instance variable
	protected long current;

	/** Constructs a progression starting at 0 */
	public Progression(){ this(0); }

	/** Construct a progression with given start */
	public Progression(long start) { current = start; }

	/** Returns the next value of the progression */
	public long nextValue(){
		long result = current;
		advance();
		return result;
	}

	/** Print the next n values of the progression, separated by space */
	public void printProgression(int n){
		System.out.print(nextValue());
		for(int i=1; i<n; i++){
			System.out.print(" " + nextValue());
		}
		System.out.println();
	}

	/** Advance the current value to the next value in the progression */
	protected void advance(){
		current++;
	}


}
