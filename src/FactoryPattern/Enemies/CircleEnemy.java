package FactoryPattern.Enemies;

import FactoryPattern.Enemy;

import java.awt.*;

public class CircleEnemy implements Enemy
{
    @Override
    public void draw(Graphics2D g2d)
    {
        g2d.drawOval(0, 0, 599, 599);
    }
}
