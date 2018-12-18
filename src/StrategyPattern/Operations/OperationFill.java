package StrategyPattern.Operations;

import StrategyPattern.Strategy;

import java.awt.*;

public class OperationFill implements Strategy {
    @Override
    public void doOperation(int num1, int num2, Graphics2D g2d) {
        g2d.fillRect(600, 600, 1 ,1);
    }
}