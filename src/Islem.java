// İşlem Arayüzü
abstract class Islem {
    protected Islem sonrakiIslem;

    public void setSonrakiIslem(Islem sonrakiIslem) {
        this.sonrakiIslem = sonrakiIslem;
    }

    public abstract void islemYap(String siparis, double odeme);
}