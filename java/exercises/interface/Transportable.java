/** Interface for objects that can be transported */
public interface Transportable {
  /** Return the weight in grams */
  public int weight();

  /** Return whether the object is hazardous */
  public boolean isHazardous();
}
