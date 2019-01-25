package ic.doc.co575;

public class NonPositiveNumber extends InvalidNaturalNumber {

  public NonPositiveNumber(Expression e1, Expression e2) {
    super(e1 + " - " + e2 + " creates a non positive number.");
  }

  public NonPositiveNumber(int val) {
    super(val + " is not a natural number (i.e., positive integer)");
  }
}
