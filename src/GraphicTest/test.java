package GraphicTest;


import FactoryPattern.Enemies.SquareEnemy;
import FactoryPattern.Enemy;
import FactoryPattern.EnemyFactory;

import java.awt.*;


public class test
{
    public static void main(String[] args) {

        Frame frame = new Frame();

        frame.add(new CustomPaintComponent());

        int frameWidth = 600;

        int frameHeight = 600;

        frame.setSize(frameWidth, frameHeight);

        frame.setVisible(true);

    }

    static class CustomPaintComponent extends Component {

        public void paint(Graphics g) {

            // Retrieve the graphics context; this object is used to paint shapes

            Graphics2D g2d = (Graphics2D)g;

            // Draw an oval that fills the window

            int x = 0;

            int y = 0;

            int w = getSize().width-1;

            int h = getSize().height-1;

            EnemyFactory enemyFactory = new EnemyFactory();

            Enemy enemy1 = enemyFactory.getEnemy("CircleEnemy");
            Enemy enemy2 = enemyFactory.getEnemy("TriangleEnemy");
            Enemy enemy3 = enemyFactory.getEnemy("SquareEnemy");
            enemy1.draw(g2d);
            enemy2.draw(g2d);
            enemy3.draw(g2d);






        }

    }

}
