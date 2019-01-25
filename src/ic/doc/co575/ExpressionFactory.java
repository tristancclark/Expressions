package ic.doc.co575;

import java.util.*;

public class ExpressionFactory {

    public static Expression randomExpression(int maxDepth) {

        if (maxDepth < 0) throw new IllegalArgumentException();

        Random ran = new Random();

        int randomDepth = ran.nextInt(maxDepth + 1); //random integer between 0 and maxDepth
        int randomEx = ran.nextInt(4) + 1; //random integer between 1 and 4
        Expression e1, e2;

        if (randomDepth == 0) {

            int randomNum1 = ran.nextInt(100) + 1; //random integer between 1 and 100
            e1 = new NaturalNumber(randomNum1);
            return e1;

        }else {
            while (true) {
                try {
                    e1 = randomExpression(maxDepth - 1);
                    e2 = randomExpression(maxDepth - 1);
                    if (randomEx == 1) return new Addition(e1, e2);
                    else if (randomEx == 2) return new Product(e1, e2);
                    else if (randomEx == 3) return new Subtraction(e1, e2);
                    else return new Division(e1, e2);
                } catch (InvalidNaturalNumber e)
                {
                    //System.out.println("Invalid Natural Number, trying again.");
                }
            }
        }


    }
}
