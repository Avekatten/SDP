package DecoratorPattern;


import java.awt.*;


public class DecoratorPatternTest
{
    public static void main(String[] args) {
        TV LEDTV = new LEDTV(new BasicTV());
        LEDTV.assemble();
        System.out.println("\n*****");

        TV HDTV = new HDTV(new LEDTV(new BasicTV()));
        HDTV.assemble();


    }

}
