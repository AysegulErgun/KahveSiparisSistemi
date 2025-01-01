// Süt Ekleyen Decorator
class SutDecorator extends KahveDecorator {
    public SutDecorator(Kahve kahve) {
        super(kahve);
    }

    @Override
    public void siparisVer(String boyut) {
        kahve.siparisVer(boyut);
        System.out.println("Süt eklendi.");
    }
}