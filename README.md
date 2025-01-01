Senaryo: Kahve Sipariş Sistemi


Bir kahve dükkanında, müşteriler farklı türde kahveler (örneğin, latte, espresso, americano) sipariş edebilir. Kahveler, müşterinin tercihlerine göre süt, şeker, vanilya gibi eklemelerle zenginleştirilebilir.


Ayrıca, kahve siparişleri hazırlanırken belirli bir işlem sırasından geçmelidir:

Ödeme doğrulama
Malzeme kontrolü
Hazırlık onayı


Kullanılacak Desenler:


Köprü (Bridge): Farklı kahve türleri ve hazırlama yöntemleri soyutlanır.


Decorator: Kahveler, eklentiler (süt, şeker, vanilya vb.) ile zenginleştirilir.


Sorumluluk Zinciri (Chain of Responsibility): Sipariş, bir işlem zincirinden geçer (örneğin, ödeme doğrulama → malzeme kontrolü → hazırlık).



Köprü (Bridge): Latte ya da espresso gibi kahve türlerinin hazırlanışı soyutlandı.


Decorator: Süt ve şeker gibi eklemeler dinamik olarak kahveye eklendi.


Sorumluluk Zinciri: Ödeme, malzeme kontrolü ve hazırlık işlemleri sırasıyla gerçekleştirildi.
