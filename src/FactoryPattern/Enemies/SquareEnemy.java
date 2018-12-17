package FactoryPattern.Enemies;

import FactoryPattern.Enemy;

public class SquareEnemy implements Enemy {
    @Override
    public void draw(int y, int x)
    {
        System.out.println("Drawing a square enemy at: " + x + "," + y);
    }
}
