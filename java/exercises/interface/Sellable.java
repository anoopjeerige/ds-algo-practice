/** Interface for objects that can be sold **/
public interface Sellable {

  /** Returns the description of the object */
  public String description();

  /** List the price in cents */
  public int listPrice();

  /** Return the lowest price in cents */
  public int lowestPrice();

}
