package ic.doc.co575;

public interface Expression extends Comparable<Expression> {

  int evaluate();

  int depth();

  boolean equals(Expression e);

  int compareTo(Expression o);

}
