package ic.doc.co575;

import java.util.Arrays;

public class ExpressionArrayFactory {

  public static Expression[] randomExpressionArray(int maxSize, int maxDepth) {

    if (maxSize == 0) {
      return null;
    }

    Expression[] expressionArray = new Expression[maxSize];
    for (int i = 0; i < maxSize; ++i) {
      expressionArray[i] = ExpressionFactory.randomExpression(maxDepth);
    }
    Arrays.sort(expressionArray);
    return expressionArray;
  }
}
