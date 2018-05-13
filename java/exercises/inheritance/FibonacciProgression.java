/** Generate the fibonacci progression */
public class FibonacciProgression extends Progression {

  // instance variable
  protected long prev;

  /** Contruct traditional Fibonacci, 0, 1, 1, 2, 3, 5...*/
  public FibonacciProgression() { this(0, 1); }

  /** Construct generalized Fibonacci give first and second values */
  public FibonacciProgression(long first, long second) {
    super(first);
    // ficticious preceding value for first
    prev = second - first;
  }

  /** Replace (prev, current) with (current, current+prev) */
  protected void advance() {
    long temp = prev;
    prev = current;
    current += temp;
  }
}
