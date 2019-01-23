package ic.doc.co575;

public class NaturalNumber implements Expression {

  private final int value;

  public NaturalNumber(int val) {
    if (val <= 0) {
      throw new IllegalArgumentException(val + " is not a natural number (i.e., positive integer)");
    }
    value = val;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @Override
  public int evaluate() {
    return this.value;
  }

  @Override
  public int depth() {
    return 0;
  }
}
