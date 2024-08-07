//Bir generic tipi <T> kısıtlayabilmek için javada wildcard lar kullanılır. Fakat kotlinde wildcart yapısı bulunmaz.
//Bunun yerine declaration-site variance ve type projections kavramları vardır.
//Generic bir sınıf veya arayüz tanımlarken tür parametreleri için in veya out anahtar kelimelerini kullanılabilir.


//invariant: <T> başına in ya da out keywordleri gelmediğinde T yerine verilen tip neyse yine o tipten değer beklenir.
// örnek: Int ise yine Int gibi.

//co-variant(out): alt tiplerin üst tiplere dönüştürülebilmesini sağlar. Dolayısıyla out varyans,
// bir sınıfın kendisi ve alt sınıfları için kullanılır
//örnek: Number ise yine Number veya Int gibi

//contra-variant(in): üst tiplerin alt tiplere dönüştürülebilmesini sağlar. Dolayısıyla in varyans,
// bir sınıfın kendisi ve üst sınıfları için kullanılır
//örnek:  Int ise yine Int ya da Number gibi.



//Özetle, out varyans alt tiplere, in varyans ise üst tiplere dönüşüme izin verir.


//

