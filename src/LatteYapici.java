// Latte Yapıcı
class LatteYapici implements KahveYapici {
    @Override
    public void kahveHazirla(String boyut) {
        System.out.println(boyut + " boyutunda Latte hazırlanıyor.");
    }
}