package DecoratorPattern;

public class HDTV extends TVDecorator {

    public HDTV(TV c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of HD TV.");
    }
}