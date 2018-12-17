package StrategyPattern;

import StrategyPattern.Operations.OperationAdd;
import StrategyPattern.Operations.OperationMultiply;

public class StrategyDesignPatternDemo
{
    public static void main(String[] args)
    {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new StrategyPattern.Operations.OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
