package StrategyPattern.Operations;

import StrategyPattern.Strategy;

import java.awt.*;

public class OperationClear implements Strategy {
    @Override
    public void doOperation(int num1, int num2, Graphics2D g2d) {
        g2d.clearRect(0, 0, num1,num2);
    }
}