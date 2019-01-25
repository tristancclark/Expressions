package ic.doc.co575;

public class Division extends BinaryExpression {

  public Division(Expression e1, Expression e2) {
    super(e1, e2);
    if (e1.evaluate() % e2.evaluate() != 0) {
      throw new NonWholeNumber(e1, e2);
    }
    if (e2.evaluate() == 0) {
      throw new NonWholeNumber();
    }
  }

  @Override
  public int evaluate() {
    return leftArgument.evaluate() / rightArgument.evaluate();
  }

  @Override
  public String toString() {
    String strLeft =
        (leftArgument.depth() == 0) ? leftArgument.toString() : "(" + leftArgument.toString() + ")";
    String strRight = (rightArgument.depth() == 0) ? rightArgument.toString()
        : "(" + rightArgument.toString() + ")";
    return strLeft + "/" + strRight;
  }

}
