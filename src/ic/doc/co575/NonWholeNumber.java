package ic.doc.co575;

public class NonWholeNumber extends InvalidNaturalNumber {
    public NonWholeNumber() { super("You cannot divide by zero."); }
    public NonWholeNumber(Expression e1, Expression e2) { super(e1 + "/" + e2 + " creates a non whole number."); }
}
