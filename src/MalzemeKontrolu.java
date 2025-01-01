// Malzeme Kontrolü
class MalzemeKontrolu extends Islem {
    @Override
    public void islemYap(String siparis, double odeme) {
        System.out.println("Malzemeler kontrol edildi: " + siparis);
        if (sonrakiIslem != null) {
            sonrakiIslem.islemYap(siparis, odeme);
        }
    }
}
