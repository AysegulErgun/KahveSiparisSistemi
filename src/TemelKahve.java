// Temel Kahve
class TemelKahve extends Kahve {
    public TemelKahve(KahveYapici kahveYapici) {
        super(kahveYapici);
    }

    @Override
    public void siparisVer(String boyut) {
        kahveYapici.kahveHazirla(boyut);
    }
}