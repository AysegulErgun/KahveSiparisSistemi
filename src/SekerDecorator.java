// Şeker Ekleyen Decorator
class SekerDecorator extends KahveDecorator {
    public SekerDecorator(Kahve kahve) {
        super(kahve);
    }

    @Override
    public void siparisVer(String boyut) {
        kahve.siparisVer(boyut);
        System.out.println("Şeker eklendi.");
    }
}
