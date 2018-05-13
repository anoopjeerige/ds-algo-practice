/** Generates geometric progression */
public class GeometricProgression extends Progression {

  // instance variable
  protected long base;

  /** Construct progression 1, 2, 4, .. */
  // start at 1 with base 2
  public GeometricProgression() { this(2, 1); }

  /** Construct progression 1, b, b^2, b^3, .... */
  public GeometricProgression(long b) { this(b, 1); }

  /** Construct progression with arbitary base and start */
  public GeometricProgression(long b, long start) {
    super(start);
    base = b;
  }

  /** Multiple the current value by the geometric base */
  protected void advance() {
    current *= base;
  }
}
