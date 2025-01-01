// Ödeme Doğrulama
class OdemeDogrulama extends Islem {
    @Override
    public void islemYap(String siparis, double odeme) {
        if (odeme <= 0) {
            System.out.println("Hata: Ödeme alınamadı!");
            return;
        }
        System.out.println("Ödeme doğrulandı.");
        if (sonrakiIslem != null) {
            sonrakiIslem.islemYap(siparis, odeme);
        }
    }
}