/** Class for object that can be sold, packed and shipped */
public class BoxedItem implements Sellable, Transportable {
  private String description;
  private int price;
  private int weight;
  private boolean haz;

  /** Constructor */
  public BoxedItem(String description, int price, int weight, boolean haz) {
    this.description = description;
    this.price = price;
    this.weight = weight;
    this.haz = haz;
  }

  /** Returns the description of the object */
  public String description() {
    return this.description;
  }

  /** List the price in cents */
  public int listPrice(){
    return this.price;
  }

  /** Return the lowest price in cents */
  public int lowestPrice() {
    return this.price / 2;
  }

  /** Return the weight in grams */
  public int weight() {
    return this.weight;
  }

  /** Return whether the object is hazardous */
  public boolean isHazardous() {
    return this.haz;
  }
}
