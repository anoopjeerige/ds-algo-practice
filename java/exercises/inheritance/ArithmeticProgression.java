/** Generates arithmetic progression. Default 0, 1, 2,...*/
public class ArithmeticProgression extends Progression {

  // Instance variable
  protected long increment;

  /** Constructs progression 0, 1, 2, .. */
  // start at 0 with increment of 1
  public ArithmeticProgression() { this(1, 0); }

  /** Contructs progression 0*stepSize, 1*stepSize,... */
  // start at 0
  public ArithmeticProgression(long stepsize) { this(stepsize, 0); }

  /** Construct arithmetic progression with arbitary start and increment */
  public ArithmeticProgression(long stepsize, long start) {
    super(start);
    increment = stepsize;
  }

  /** Add arithmetic increment to the current value */
  protected void advance(){
    current += increment;
  }
}
