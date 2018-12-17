package FactoryPattern.Enemies;

import FactoryPattern.Enemy;

public class TriangleEnemy implements Enemy {
    @Override
    public void draw(int y, int x)
    {
        System.out.println("Drawing a triangle enemy at: " + x + "," + y);
    }
}
