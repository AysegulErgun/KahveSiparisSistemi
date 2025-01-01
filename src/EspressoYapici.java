// Espresso Yapıcı
class EspressoYapici implements KahveYapici {
    @Override
    public void kahveHazirla(String boyut) {
        System.out.println(boyut + " boyutunda Espresso hazırlanıyor.");
    }
}