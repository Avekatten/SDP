package FlyWeight;

public class FlyWeightDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Background background = (Background) BackgroundFactory.getBackground(getRandomColor());
            background.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
