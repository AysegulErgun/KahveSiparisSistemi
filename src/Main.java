public class Main {
    public static void main(String[] args) {
        // Köprü: Kahve türü seçimi
        KahveYapici latteYapici = new LatteYapici();
        Kahve kahve = new TemelKahve(latteYapici);

        // Decorator: Süt ve şeker ekleme
        kahve = new SutDecorator(kahve);
        kahve = new SekerDecorator(kahve);

        // Sorumluluk Zinciri: İşlem zinciri oluşturma
        Islem odemeDogrulama = new OdemeDogrulama();
        Islem malzemeKontrolu = new MalzemeKontrolu();
        Islem hazirlikOnayi = new HazirlikOnayi();

        odemeDogrulama.setSonrakiIslem(malzemeKontrolu);
        malzemeKontrolu.setSonrakiIslem(hazirlikOnayi);

        // Sipariş bilgisi
        String siparis = "Latte";
        double odeme = 25.0;

        // Zinciri çalıştır
        odemeDogrulama.islemYap(siparis, odeme);

        // Kahveyi hazırla
        kahve.siparisVer("Orta");
    }
}