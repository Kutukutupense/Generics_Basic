// Genericler, sınıfların, arayüzlerin ve fonksiyonların belirli bir veri türüne bağlı kalmadan çalışabilmelerini sağlar.
// tür parametreleri ile esneklik kazandırırlar. Genericler sayesinde kod tekrarından kaçınılır ve tip güvenliği sağlanır.
// List<T> gibi bir yapı, farklı türlerdeki elemanlarla çalışabilen bir liste oluşturur ve bu tür parametresi T yerine
// her seferinde farklı türler (örneğin, List<Int> veya List<String>) kullanılabilir. Bu şekilde, genericler,
// yazılımın daha modüler ve sürdürülebilir olmasına katkıda bulunur.


fun main(){
    val mainfragment = MainFragment()
    val dashboardFragment = DashboardFragment()
    val greetFragment = GreetFragment()

    mainfragment.call()
    dashboardFragment.call()
    greetFragment.call()


}


abstract class BaseFragment(){  // soyut bir parent class oluşturduk
    fun <T> printParam(param:T){ //fonksiyon içine Hangi type ın geleceğini bilmediğimiz için T olarak tanımladık.
        println(param)
    }
}

class MainFragment : BaseFragment(){
    fun call(){
        printParam(3) //görüldüğü gibi Int de gelse ok
    }
}

class DashboardFragment: BaseFragment() {
    fun call() {
        printParam("Eylem") // string de gelse ok.
    }
}
class GreetFragment: BaseFragment(){
    fun call(){
        printParam(listOf(3,5,4,6,6,)) //liste de gelse ok herşey gelebilir.
    }
}

//Genericlerin Fonksiyonlardaki syntax'ı: T tipi ya parametre olarak eklenmesi gerekir ya da geri dönüş tipi olarak.

fun <T> foo(t: T){ //parametre olarak eklenmiş
}
fun <T> foo2():T{ // geri dönüş tipi olarak eklenmiş

}
fun <T> foo3(t:T):T{ // hem parametre hem geri dönüş tipi olarak eklenmiş

}

//Genericlerin Classlarda syntax'ı:  constructer olarak t parametresine T generic tipi verilebilir

class Boo<T>(t:T){

}
