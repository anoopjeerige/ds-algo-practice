public class r12 {

  public static void display(GameEntry[] x) {
    for (GameEntry item: x) {
      System.out.print(item.getScore() + " ");
    }
    System.out.print("\n");
  }

  public static void init(GameEntry[] x) {
    for (int i=0; i < x.length; i ++) {
      x[i] = new GameEntry();
    }
  }

  public static void main(String[] args) {

    GameEntry[] A = new GameEntry[5];
    init(A);
    GameEntry[] B = A.clone();
    A[4].setScore(550);

    display(A);
    display(B);
  }
}
