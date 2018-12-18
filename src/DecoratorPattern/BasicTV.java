package DecoratorPattern;

public class BasicTV implements TV {

    @Override
    public void assemble() {
        System.out.print("Basic TV.");
    }

}