package FlyWeight;

public class Background implements BackgroundShape{

    private String color;

    public Background(String color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Background " + color);
    }
}
