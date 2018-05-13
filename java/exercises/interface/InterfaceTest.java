public class InterfaceTest {
  public static void main(String[] args) {
    Photograph p = new Photograph("MyFailure", 5, true);
    System.out.println(p.description() + p.listPrice() + p.lowestPrice());
    BoxedItem b = new BoxedItem("MyStuff", 5, 5, false);
    System.out.println(b.description() + b.listPrice() + b.lowestPrice() + b.weight() + b.isHazardous());
  }
}
