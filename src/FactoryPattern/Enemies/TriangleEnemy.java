package FactoryPattern.Enemies;

import FactoryPattern.Enemy;

import java.awt.*;

public class TriangleEnemy implements Enemy {
    @Override
    public void draw(Graphics2D g2d)
    {
        g2d.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    }
}
