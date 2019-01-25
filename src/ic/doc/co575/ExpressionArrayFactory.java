package ic.doc.co575;

import java.util.*;

public class ExpressionArrayFactory {
    public static Expression[] randomExpressionArray(int maxSize, int maxDepth) {

        if (maxSize == 0){
            return null;
        }

        ExpressionFactory eFactory = new ExpressionFactory();

        Expression[] eArray = new Expression[maxSize];
        for (int i = 0; i < maxSize; ++i) {
            eArray[i] = eFactory.randomExpression(maxDepth);
        }
        Arrays.sort(eArray);
        return eArray;
    }
}