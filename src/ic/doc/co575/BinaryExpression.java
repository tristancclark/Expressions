package ic.doc.co575;

public abstract class BinaryExpression implements Expression {

  protected final Expression leftArgument;
  protected final Expression rightArgument;

  public BinaryExpression(Expression e1, Expression e2) {
    this.leftArgument = e1;
    this.rightArgument = e2;
  }

  public Expression getLeft() {
    return leftArgument;
  }

  public Expression getRight() {
    return rightArgument;
  }

  @Override
  public int depth() {
    return (leftArgument.depth() > rightArgument.depth()) ? leftArgument.depth() + 1
        : rightArgument.depth() + 1;
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
