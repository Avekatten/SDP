package DecoratorPattern;

public class TVDecorator implements TV {

    protected TV TV;

    public TVDecorator(TV c){
        this.TV =c;
    }

    @Override
    public void assemble() {
        this.TV.assemble();
    }

}