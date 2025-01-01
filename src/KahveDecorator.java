// Kahve Decorator
abstract class KahveDecorator extends Kahve {
    protected Kahve kahve;

    public KahveDecorator(Kahve kahve) {
        super(kahve.kahveYapici);
        this.kahve = kahve;
    }
}