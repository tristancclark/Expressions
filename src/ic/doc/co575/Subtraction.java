package ic.doc.co575;

public class Subtraction extends BinaryExpression {

    public Subtraction(Expression e1, Expression e2) {
        super(e1, e2);
        if (e2.evaluate() >= e1.evaluate())
            throw new NonPositiveNumber(e1, e2);
    }

    @Override
    public int evaluate() { return leftArgument.evaluate() - rightArgument.evaluate(); }

    @Override
    public String toString() {
        String strLeft = (leftArgument.depth() == 0) ? leftArgument.toString() : "(" + leftArgument.toString() + ")";
        String strRight = (rightArgument.depth() == 0) ? rightArgument.toString() : "(" + rightArgument.toString() + ")";
        return strLeft + "-" + strRight; }

}
