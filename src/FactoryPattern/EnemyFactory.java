package FactoryPattern;

import FactoryPattern.Enemies.CircleEnemy;
import FactoryPattern.Enemies.SquareEnemy;
import FactoryPattern.Enemies.TriangleEnemy;

public class EnemyFactory
{
    //use getShape method to get object of type shape
    public Enemy getEnemy(String enemyType)
    {
        if(enemyType == null){
            return null;
        }
        if(enemyType.equalsIgnoreCase("SquareEnemy"))
        {
            return new SquareEnemy();
        }
        else if(enemyType.equalsIgnoreCase("CircleEnemy"))
        {
            return new CircleEnemy();
        }
        else if(enemyType.equalsIgnoreCase("TriangleEnemy"))
        {
            return new TriangleEnemy();
        }
        return null;
    }
}
