/**
* A simple flower class
*
*@author Anoop
*/

public class Flower {

  // name of flower
  private String name;

  // number of petals
  private int numPetals;

  // price of flowers
  private float price;


  /** Constructor */
  public Flower() { this(null, 0, 0.0f); }

  /** Constructor */
  public Flower(String name) { this(name, 0, 0.0f); }

  /** Constructor */
  public Flower(String name, int numPetals) { this(name, numPetals, 0.0f); }

  /** parameterized constructor */
  public Flower(String name, int numPetals, float price) {
    this.name = name;
    this.numPetals = numPetals;
    this.price = price;
  }

  /** Accessor methods */
  public String getName() { return this.name; }
  public int getNumPetals() { return this.numPetals; }
  public float getPrice() { return this.price; }

  /** Mutator methods */
  public void setName(String name) { this.name = name; }
  public void setNumPetals(int numPetals) { this.numPetals = numPetals; }
  public void setPrice(float price) { this.price = price; }

  public static void main(String args[]) {

    Flower[] flowerList = new Flower[3];
    flowerList[0] = new Flower("Lily");
    flowerList[1] = new Flower("Iris", 5);
    flowerList[2] = new Flower("Hibiscus", 6, 5.5f);

    for(int i= 0; i<flowerList.length; i++) {
      System.out.println("FLower name: "+ flowerList[i].getName() + "\tNumber of Petals: " + flowerList[i].getNumPetals() + "\tPrice: " + flowerList[i].getPrice());
    }


  }

}
