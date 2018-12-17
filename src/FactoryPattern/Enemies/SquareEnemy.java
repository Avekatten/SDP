package FactoryPattern.Enemies;

import FactoryPattern.Enemy;

import java.awt.*;

public class SquareEnemy implements Enemy {
    @Override
    public void draw(Graphics2D g2d)
    {
        g2d.drawRect(150, 150,300,300);
    }
}
