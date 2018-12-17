package GraphicTest;


import FactoryPattern.Enemy;
import FactoryPattern.EnemyFactory;

import java.awt.*;


public class test
{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
        {
            Frame frame = new Frame();

            frame.add(new CustomPaintComponent());

            int frameWidth = 600;

            int frameHeight = 600;

            frame.setSize(frameWidth, frameHeight);

            frame.setVisible(true);
        }


    }

    static class CustomPaintComponent extends Component {

        public void paint(Graphics g) {

            Graphics2D g2d = (Graphics2D)g;


            // THIS IS THE FACTORY PATTERN IN USE RIGHT HERE
            EnemyFactory enemyFactory = new EnemyFactory();

            Enemy enemy1 = enemyFactory.getEnemy("CircleEnemy");
            Enemy enemy2 = enemyFactory.getEnemy("TriangleEnemy");
            Enemy enemy3 = enemyFactory.getEnemy("SquareEnemy");


            enemy1.draw(g2d);
            enemy2.draw(g2d);
            enemy3.draw(g2d);
            // FACTORY PATTERN ENDS HERE

            // STRATEGY PATTERN


            //





        }

    }

}
