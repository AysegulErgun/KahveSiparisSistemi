// Kahve
abstract class Kahve {
    protected KahveYapici kahveYapici;

    public Kahve(KahveYapici kahveYapici) {
        this.kahveYapici = kahveYapici;
    }

    public abstract void siparisVer(String boyut);
}