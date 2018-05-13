public class GameEntry {

  // game scores
  private int score;

  /** Contruct a game entry with default score 0 */
  public GameEntry() { this(0); }

  /** Construct a game entry with give score */
  public GameEntry(int score) { this.score = score; }

  /** Accessor for score */
  public int getScore() {
    return this.score;
  }

  /** Mutator for score */
  public void setScore(int score) {
    this.score = score;
  }

}
