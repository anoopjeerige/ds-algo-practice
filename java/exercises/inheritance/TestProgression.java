/** Test program for the progession hierarchy. */
public class TestProgression {
  public static void main(String[] args){
    Progression prog;
    // test default progression
    System.out.println("Default progression");
    prog = new Progression();
    prog.printProgression(10);

    // Test arithmetic progression
    System.out.println("AP with default increment");
    prog = new ArithmeticProgression();
    prog.printProgression(10);
    System.out.println("AP with increment 5");
    prog = new ArithmeticProgression(5);
    prog.printProgression(10);
    System.out.println("AP with start 2 increment 5");
    prog = new ArithmeticProgression(5, 2);
    prog.printProgression(10);

    // Test geometric progression
    System.out.println("GP with default base");
    prog = new GeometricProgression();
    prog.printProgression(10);
    System.out.println("GP with base 3");
    prog = new GeometricProgression(3);
    prog.printProgression(10);
    System.out.println("GP with base 3 and start 4");
    prog = new GeometricProgression(3, 4);
    prog.printProgression(10);

    // Test Fibonacci progression
    System.out.println("Traditional FP");
    prog = new FibonacciProgression();
    prog.printProgression(10);
    System.out.println("Custom FP with first 4 and second 6");
    prog = new FibonacciProgression(4, 6);
    prog.printProgression(10);

  }
}
