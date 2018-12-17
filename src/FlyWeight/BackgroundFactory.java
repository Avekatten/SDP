package FlyWeight;

import java.util.HashMap;

public class BackgroundFactory {
    private static final HashMap backgroundMap = new HashMap();

    public static BackgroundShape getBackground(String color) {
        Background background = (Background)backgroundMap.get(color);

        if(background == null) {
            background = new Background(color);
            backgroundMap.put(color, background);
            System.out.println("Creating circle of color : " + color);
        }
        return background;
    }
}
