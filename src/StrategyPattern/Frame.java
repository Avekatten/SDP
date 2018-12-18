package StrategyPattern;

import java.awt.*;

public class Frame {
    private Strategy strategy;

    public Frame(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2, Graphics2D g2d){
         strategy.doOperation(num1, num2, g2d);
    }
}