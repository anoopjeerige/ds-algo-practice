/** Class for photographs that can be sold */
public class Photograph implements Sellable {
  private String descript;
  private int price;
  private boolean color;

  public Photograph(String descript, int price, boolean color) {
    this.descript = descript;
    this.price = price;
    this.color = color;
  }

  public String description() { return this.descript; }
  public int listPrice() { return this.price; }
  public int lowestPrice() { return this.price / 2; }
  public boolean isColor() { return this.color; }
  
}
