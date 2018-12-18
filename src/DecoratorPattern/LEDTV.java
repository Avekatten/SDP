package DecoratorPattern;

public class LEDTV extends TVDecorator {

    public LEDTV(TV c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of LED TV.");
    }
}