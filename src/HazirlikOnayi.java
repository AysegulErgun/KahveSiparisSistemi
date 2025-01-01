// Hazırlık Onayı
class HazirlikOnayi extends Islem {
    @Override
    public void islemYap(String siparis, double odeme) {
        System.out.println("Sipariş hazırlığı onaylandı: " + siparis);
    }
}