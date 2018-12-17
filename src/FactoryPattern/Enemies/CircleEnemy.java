package FactoryPattern.Enemies;

import FactoryPattern.Enemy;

public class CircleEnemy implements Enemy
{
    @Override
    public void draw(int y, int x)
    {
        System.out.println("Drawing a circle enemy at: " + x + "," + y);
    }
}
