package ic.doc.co575;

public class NaturalNumber implements Expression {

  private final int value;

  public NaturalNumber(int val) {
    if (val <= 0) {
      throw new NonPositiveNumber(val);
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

  @Override
  public boolean equals(Expression e) {
    if (this.evaluate() == e.evaluate()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int compareTo(Expression e) {
    if (this.evaluate() == e.evaluate()) {
      return 0;
    } else if (this.evaluate() > e.evaluate()) {
      return 1;
    }
    return -1;
  }
}
